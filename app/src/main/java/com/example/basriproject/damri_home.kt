package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class damri_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_damri_home)

        val btnindralaya = findViewById<ImageButton>(R.id.btnindralaya)

        btnindralaya.setOnClickListener {

            val intent = Intent(this, damri_To_Indralayo::class.java)
            startActivity(intent)
        }
    }
}