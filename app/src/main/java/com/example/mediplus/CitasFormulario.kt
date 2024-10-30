package com.example.mediplus

import android.app.DatePickerDialog.OnDateSetListener
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class CitasFormulario: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citas_formulario)
        val editDate1 = findViewById<EditText>(R.id.editTextText1)
        editDate1.setOnClickListener{
            showDatePickerDialog()
        }

        //Se vincula el botón por su ID
        val button = findViewById<Button>(R.id.button2)

        //Se agrega el listener para el clic
        button.setOnClickListener {
            // Se crea el Intent para navegar a la nueva actividad
            val intent = Intent(this, CitaCreada::class.java)
            startActivity(intent)
        }
    }

    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment {day, month, year -> OnDateSelected(day, month, year)}
        datePicker.show(supportFragmentManager, "datePicker")
    }

    fun OnDateSelected(day:Int, month:Int, year:Int){

    }
}