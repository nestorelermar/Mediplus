package com.example.mediplus

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        val ImageButton = findViewById<ImageButton>(R.id.activity_login)

        ImageButton.setOnClickListener {
            finish()
        }
    }
}