package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class damri_To_Indralayo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_damri_to_indralayo)

        val btnjadwal = findViewById<ImageButton>(R.id.btnjadwal)

        btnjadwal.setOnClickListener {

            val intent = Intent(this, pilihkursi_To_Indralaya::class.java)
            startActivity(intent)
        }
    }
}