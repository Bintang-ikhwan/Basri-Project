package com.example.basriproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basriproject.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnmasuk2.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passEt.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty())

                firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {  }
                else {
                    Toast.makeText(this, "Empty Fields is not Allowed!", Toast.LENGTH_SHORT).show()

            }


            val btnmasuk2 = findViewById<ImageButton>(R.id.btnmasuk2)

            btnmasuk2.setOnClickListener {

                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        }
    }

}