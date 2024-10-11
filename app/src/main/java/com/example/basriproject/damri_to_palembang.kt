package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class damri_to_palembang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_damri_to_palembang)

        val btnjadwalpalembang = findViewById<ImageButton>(R.id.btnjadwalpalembang)

        btnjadwalpalembang.setOnClickListener {

            val intent = Intent(this, pilih_kursi_to_plg::class.java)
            startActivity(intent)

        }
    }
}