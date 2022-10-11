package com.willyramad.profileblur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.willyramad.profileblur.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel : BlurViewModel by viewModels { BlurViewModelFactory(application)  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.update.setOnClickListener {
            viewModel.applyBlur(3)
        }
    }
}