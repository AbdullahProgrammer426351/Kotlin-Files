package com.example.demokotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.yield
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        private const val TAG = "MyTAG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        We will discuss two methods for launching new coroutines that block(suspend) the coroutine execution of next statements until
        they are not fully executed and completed. Because If we launch simply a coroutine using
        GlobalScope.launch{} or CoroutineScope.launch{}, it will run separately independent of
        other lines of parent coroutine. Below is the example of executeTask() method.If we use typical
        approach, output will be :
        Before
        After
        Inside---Because it will be printed after delay of 1 sec.

        Approach 1:
        withContext(Dispatchers.IO){}
        this method will hold(suspend) execution of next statements until it is completely executed.
        Using this approach, output will be:
        Before
        Inside----this and below lines will be printed after delay of 1 sec.


        Approach 2:
        runBlocking{}
        This will be more suitable in Console applications because in Android App case. App execution
        not stops. There for, that approach is separately mentioned in kotlin file of other folder.
        After
        * */
        GlobalScope.launch {
            executeTask()
        }
    }

    private suspend fun executeTask(){
        Log.d(TAG, "==================== Executing Task ============================")
        Log.d(TAG, "Before")
        withContext(Dispatchers.IO){
            delay(1000)
            Log.d(TAG, "inside")
        }
//        GlobalScope.launch {
//            delay(1000)
//            Log.d(TAG, "inside")
//        }

        Log.d(TAG, "After")

    }



}