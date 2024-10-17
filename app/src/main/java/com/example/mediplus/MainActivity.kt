package com.example.mediplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPeril = findViewById<Button>(R.id.button_perfil)

        buttonPeril.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }

        val recordatorioMedicamentos = findViewById<CardView>(R.id.recordatorioMedicamentos)

        recordatorioMedicamentos.setOnClickListener {
            val modulo_medicamentos = Intent(this, ModuloMedicamentos::class.java)
            startActivity(modulo_medicamentos)
        }

        val recordatorioCitas = findViewById<CardView>(R.id.recordatorioCitas)

        recordatorioCitas.setOnClickListener {
            val modulo_citas = Intent(this, ModuloCitas::class.java)
            startActivity(modulo_citas)
        }

        val recordatorioHidratacion = findViewById<CardView>(R.id.recordatorioHidratacion)

        recordatorioHidratacion.setOnClickListener {
            val modulo_hidratacion = Intent(this, VerInfoModuloMedicamentos::class.java)
            startActivity(modulo_hidratacion)
        }

        val recordatorioAnotaciones = findViewById<CardView>(R.id.recordatorioAnotaciones)

        recordatorioAnotaciones.setOnClickListener {
            val modulo_anotaciones = Intent(this, ListarModuloMedicamentos::class.java)
            startActivity(modulo_anotaciones)
        }
    }
}