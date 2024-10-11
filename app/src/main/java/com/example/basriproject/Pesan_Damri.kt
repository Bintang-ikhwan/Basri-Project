package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pesan_Damri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pesan_damri)

        val btnpesandamri = findViewById<ImageButton>(R.id.btnpesandamri)

        btnpesandamri.setOnClickListener {

            val intent = Intent(this, pembayaran_berhasil_to_indralaya::class.java)
            startActivity(intent)
        }
    }
}