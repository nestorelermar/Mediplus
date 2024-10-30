package com.example.mediplus

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Citas: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulo_citas)

        //Se vincula el botón por su ID
        val button = findViewById<TextView>(R.id.textView16)

        //Se agrega el listener para el clic
        button.setOnClickListener {
            // Se crea el Intent para navegar a la nueva actividad
            val intent = Intent(this, CitasFormulario::class.java)
            startActivity(intent)
        }
    }
}