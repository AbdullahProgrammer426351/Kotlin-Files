package com.example.demokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.incrementBtn.setOnClickListener {
            count++
            binding.countTv.text = count.toString()
        }

        binding.doOperationBtn.setOnClickListener {
            // through thread
//            thread {
//                for (i in 0..(10000000000L)) {
//                    count++
//                    binding.countTv.text = count.toString()
//                }
//            }

            // through coroutine
            CoroutineScope(Dispatchers.Main).launch {
                for (i in 0..(10000000000L)) {
                    count++
                }
            }

        }
    }

}