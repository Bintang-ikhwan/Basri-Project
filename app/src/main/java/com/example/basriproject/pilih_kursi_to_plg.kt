package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pilih_kursi_to_plg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pilih_kursi_to_plg)

        val konfirmbayar2 = findViewById<ImageButton>(R.id.konfirmbayar2)

        konfirmbayar2.setOnClickListener {

            val intent = Intent(this, pesan_damri_plg::class.java)
            startActivity(intent)

        }
    }
}