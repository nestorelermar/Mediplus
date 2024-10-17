package com.example.mediplus

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val buttonRegressMenuPrincipal = findViewById<ImageView>(R.id.buttom_regresar_menu_principal)

        buttonRegressMenuPrincipal.setOnClickListener {
            finish()
        }

        val editPerfil = findViewById<ImageView>(R.id.editar)

        editPerfil.setOnClickListener {
            val intent = Intent(this, Editar_perfil::class.java)
            startActivity(intent)
        }
    }
}