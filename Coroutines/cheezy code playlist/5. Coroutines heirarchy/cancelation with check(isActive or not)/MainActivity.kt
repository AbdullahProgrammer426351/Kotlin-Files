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
import kotlinx.coroutines.isActive
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
        /*
        * Cancelling Coroutine is simple in some cases therefore I skipped that simple scenario code.
        * I am only writing code for complex case here
        * */
        GlobalScope.launch(Dispatchers.Main) { execute() }

    }

    private suspend fun execute() {
        val parentJob = CoroutineScope(Dispatchers.IO).launch {
            for (i in 1..1000) {
                if (isActive) {
                    // if we will not check here using isActive, coroutine will be cancelled but
                    // thread will be busy in doing task.And it will print lines also after cancelling.
                    executeLongRunningTask()
                    Log.d(TAG, i.toString())
                }
            }
        }

        delay(1000)
        Log.d(TAG, "Cancelling Job")
        parentJob.cancel()
        parentJob.join()
        Log.d(TAG, "Parent completed")
    }

    private fun executeLongRunningTask() {
        for (i in 1..1000000) {
        }
    }

}