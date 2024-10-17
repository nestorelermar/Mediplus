package com.example.mediplus

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ModuloMedicamentos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo_medicamentos)

        val bottonCrear = findViewById<LinearLayout>(R.id.bottonCrearMedicamento)

        bottonCrear.setOnClickListener {
            val crear = Intent(this, CrearModuloMedicamentos::class.java)
            startActivity(crear)
        }

    }
}