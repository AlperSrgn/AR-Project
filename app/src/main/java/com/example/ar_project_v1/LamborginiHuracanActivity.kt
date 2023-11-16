package com.example.ar_project_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LamborginiHuracanActivity : AppCompatActivity() {
    private lateinit var LamborginiHuracanButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamborgini_huracan)

        LamborginiHuracanButton= findViewById(R.id.lamborginiHuracanButton)

        LamborginiHuracanButton.setOnClickListener {
            val intent = Intent(this, LamborginiHuracanCameraActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}