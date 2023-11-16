package com.example.ar_project_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LamborginiGallardoActivity : AppCompatActivity() {
    private lateinit var LamborginiGallardoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamborgini_gallardo)

        LamborginiGallardoButton= findViewById(R.id.lamborginiGallardoButton)

        LamborginiGallardoButton.setOnClickListener {
            val intent = Intent(this, LamborginiGallardoCameraActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}