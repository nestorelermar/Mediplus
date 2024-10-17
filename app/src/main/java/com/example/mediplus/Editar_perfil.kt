package com.example.mediplus

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Editar_perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_perfil)

        val buttonRegressMenuPrincipal = findViewById<LinearLayout>(R.id.buttom_regresar_perfil)

        buttonRegressMenuPrincipal.setOnClickListener {
            finish()
        }
    }
}