package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActiviry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activiry)

        val button = findViewById<Button>(R.id.register_button)
        button.setOnClickListener {

            val intent = Intent(this, RegisterActiviry::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        println("#Academy onStart")
    }

    override fun onResume() {
        super.onResume()
        println("#Academy onResume")
    }

    override fun onPause() {
        super.onPause()
        println("#Academy onPause")
    }

    override fun onStop() {
        super.onStop()
        println("#Academy onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("#Academy onDestroy")
    }
}