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

    /*
    * Nested coroutines can also be used in child and parent relation.
    * It parent is cancelled, children will also and same if delay(await, join etc)
    * */
    private suspend fun execute() {
        val parentJob = GlobalScope.launch(Dispatchers.Main) {
            Log.d(TAG, "parent - $coroutineContext")

            val childJob = launch(Dispatchers.IO) {
                // child job will inherit context from its parent.
                // we can also explicitly define as launch(context) as we did for parent.
                Log.d(TAG, "child - $coroutineContext")
            }
        }
    }
}