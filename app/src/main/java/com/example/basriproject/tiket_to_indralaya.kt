package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tiket_to_indralaya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tiket_to_indralaya)

        val btnberanda = findViewById<ImageButton>(R.id.btnberanda)

        btnberanda.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}