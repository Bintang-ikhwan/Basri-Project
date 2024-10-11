package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pembayaran_berhasil_to_plg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pembayaran_berhasil_to_plg)

        val btnlanjutkanplg = findViewById<ImageButton>(R.id.btnlanjutkanplg)

        btnlanjutkanplg.setOnClickListener {

            val intent = Intent(this, tiket_to_indralaya::class.java)
            startActivity(intent)
        }
    }
}