package com.example.ar_project_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Porsche718_Activity : AppCompatActivity() {
    private lateinit var porsche718Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_porsche718)

        porsche718Button= findViewById(R.id.porsche718Button)

        porsche718Button.setOnClickListener {
            val intent = Intent(this, Porsche718CameraActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}