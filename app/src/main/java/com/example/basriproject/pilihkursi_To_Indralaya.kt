package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pilihkursi_To_Indralaya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pilihkursi_to_indralaya)

        val konfirmbayar = findViewById<ImageButton>(R.id.konfirmbayar)

        konfirmbayar.setOnClickListener {

            val intent = Intent(this, Pesan_Damri::class.java)
            startActivity(intent)
        }
    }
}