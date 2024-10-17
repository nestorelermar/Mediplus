package com.example.mediplus.inicio_sesion

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.mediplus.MainActivity
import com.example.mediplus.R
import com.example.mediplus.Registrarse

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonIniciarSesion = findViewById<LinearLayout>(R.id.ButtonIniciarSesion)

        buttonIniciarSesion.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val buttonRegister = findViewById<LinearLayout>(R.id.ButtonRegister)

        buttonRegister.setOnClickListener {
            val intent = Intent(this, Registrarse::class.java)
            startActivity(intent)
        }

    }
}