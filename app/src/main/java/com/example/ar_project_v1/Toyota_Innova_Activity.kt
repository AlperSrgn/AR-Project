package com.example.ar_project_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Toyota_Innova_Activity : AppCompatActivity() {
    private lateinit var InnovaButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toyota_innova)

        InnovaButton= findViewById(R.id.toyotaInnovaButton)

        InnovaButton.setOnClickListener {
            val intent = Intent(this, Toyota_Innova_Camera_Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}