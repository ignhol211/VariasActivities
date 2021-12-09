package com.example.variasactivities


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.variasactivities.databinding.ActivitySecondBinding

class SecondActivity  : AppCompatActivity(){

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getIntExtra("NUM_ALEATORIO",0)

        binding.tvTexto.text = "$initialData"

        binding.bNextActivity2.setOnClickListener{
            LastActivity.launch(this,binding.tvTexto.text.toString())
        }
    }

}