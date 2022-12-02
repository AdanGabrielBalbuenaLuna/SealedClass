package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Se promete la vista
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//Sustituye a setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener {
            toast()
        }
    }

    private fun toast(){  
        Toast.makeText(this,"You are using Binding", Toast.LENGTH_SHORT).show()
    }
}