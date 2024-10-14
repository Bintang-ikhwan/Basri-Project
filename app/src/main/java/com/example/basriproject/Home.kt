package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val btnticket = findViewById<ImageButton>(R.id.btnticket)

        btnticket.setOnClickListener {

            val intent = Intent(this, tiket_home::class.java)
            startActivity(intent)
        }

        val btnpilih = findViewById<ImageButton>(R.id.btnpilih)

        btnpilih.setOnClickListener {

            val intent = Intent(this, damri_home::class.java)
            startActivity(intent)




        }
        val btnakun12 = findViewById<ImageButton>(R.id.btnakun12)

        btnakun12.setOnClickListener {

            val intent = Intent(this, profile::class.java)
            startActivity(intent)




        }
    }
}