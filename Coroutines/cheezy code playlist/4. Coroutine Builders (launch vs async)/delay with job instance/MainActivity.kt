package com.example.demokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        private const val TAG = "MyTAG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        CoroutineScope(Dispatchers.IO).launch {
            printFollowers()
        }
    }

    // without using job instance (output : 0)
//    private suspend fun printFollowers(){
//        var fbFollowers = 0
//        CoroutineScope(Dispatchers.IO).launch {
//            fbFollowers = getFbFollowers()
//        }
//        Log.d(TAG, fbFollowers.toString())
//    }


    // using job.
    /*
    * 'Job' is return type of launch(). Using this, we can
    * handle our Coroutines such as canceling it, delaying next
    * code line until task is done and much more.
    * */
    private suspend fun printFollowers(){
        var fbFollowers = 0
        val job = CoroutineScope(Dispatchers.IO).launch {
            fbFollowers = getFbFollowers()
        }
        job.join()// this will stop execution of next lines until coroutine has done its work
        Log.d(TAG, fbFollowers.toString())
    }

    private suspend fun getFbFollowers():Int{
        delay(1000)
        return 54
    }
}