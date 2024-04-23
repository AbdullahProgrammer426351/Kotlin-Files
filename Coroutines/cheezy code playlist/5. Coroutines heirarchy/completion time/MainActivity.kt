package com.example.demokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
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
        CoroutineScope(Dispatchers.Main).launch {
            execute()
        }
    }

    // parent will be completed after completion of child

    private suspend fun execute() {
        val parentJob = GlobalScope.launch(Dispatchers.Main) {
            Log.d(TAG, "parent started")

            val childJob = launch(Dispatchers.IO) {
            Log.d(TAG, "child started")
                delay(500)
                Log.d(TAG, "child ended")
            }
                delay(300)
            Log.d(TAG, "parent end")
        }

        parentJob.join()
        Log.d(TAG, "Parent completed")
    }
}