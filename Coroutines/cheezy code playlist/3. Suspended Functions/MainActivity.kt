package com.example.demokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
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
            task1()
        }
        CoroutineScope(Dispatchers.IO).launch {
            task2()
        }
    }
    private suspend fun task1(){
        Log.d(TAG,"Starting Task 1")
        // suspension point below (where coroutine is suspended. If I comment it, suspend modifier will be redundant because there is no need of suspending because there is no time taking process)
        yield()
        Log.d(TAG,"Ending Task 1")
    }

    private suspend fun task2(){
        Log.d(TAG,"Starting Task 2")
        yield()
        Log.d(TAG,"Ending Task 2")
    }
}