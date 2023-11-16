package com.example.ar_project_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Vw_Beetle_Activity : AppCompatActivity() {

    private lateinit var BeetleButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vw_beetle)

        BeetleButton = findViewById(R.id.beetleButton)

        BeetleButton.setOnClickListener {
            val intent = Intent(this, Vw_Beetle_Camera_Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}