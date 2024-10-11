package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pesan_damri_plg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pesan_damri_plg)

        val pesandamriplg = findViewById<ImageButton>(R.id.pesandamriplg)

        pesandamriplg.setOnClickListener {

            val intent = Intent(this, pembayaran_berhasil_to_plg::class.java)
            startActivity(intent)
        }
    }
}