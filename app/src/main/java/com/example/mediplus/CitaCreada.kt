package com.example.mediplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CitaCreada: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cita_creada)

        //Se vincula el botón por su ID
        val button = findViewById<Button>(R.id.button3)

        //Se agrega el listener para el clic
        button.setOnClickListener {
            // Se crea el Intent para navegar a la nueva actividad
            val intent = Intent(this, ListarCitas::class.java)
            startActivity(intent)
        }
    }
}