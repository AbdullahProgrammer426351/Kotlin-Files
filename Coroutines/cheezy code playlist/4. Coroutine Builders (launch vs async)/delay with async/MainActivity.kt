package com.example.demokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
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
    * Deferred<T> (which is generic) is return type of async(). In this, T is will be the object
    * of data type of last statement's return type used in that async() function. So variable 'job' return
    * type will be 'Deferred<Int>' in this case
    *
    * Defer means postpone. Because it is delaying until result is not obtained
    * */
    private suspend fun printFollowers(){
        val job = CoroutineScope(Dispatchers.IO).async {
            getFbFollowers()
        }
        // task of join() will be now performed by await()
        Log.d(TAG, job.await().toString())
    }

    private suspend fun getFbFollowers():Int{
        delay(1000)
        return 54
    }
}