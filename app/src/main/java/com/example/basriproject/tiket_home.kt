package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tiket_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tiket_home)

        val btnberanda1 = findViewById<ImageButton>(R.id.btnberanda1)

        btnberanda1.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)

            val btnakun1 = findViewById<ImageButton>(R.id.btnakun1)

            btnakun1.setOnClickListener {

                val intent = Intent(this, profile::class.java)
                startActivity(intent)

            }
        }
    }
}