package com.example.ar_project_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Volkswagen_Amarok_Activity : AppCompatActivity() {

    private lateinit var VolkswagenButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volkswagen_amarok)

        VolkswagenButton = findViewById(R.id.amarokButton)

        VolkswagenButton.setOnClickListener {
            val intent = Intent(this, Volkswagen_Amarok_Camera_Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}