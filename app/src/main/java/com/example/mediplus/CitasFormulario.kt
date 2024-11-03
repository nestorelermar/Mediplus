package com.example.mediplus

import android.annotation.SuppressLint
import android.app.DatePickerDialog.OnDateSetListener
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class CitasFormulario: AppCompatActivity() {
    private lateinit var etDate: EditText
    private lateinit var EtTime: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citas_formulario)
        etDate = findViewById<EditText>(R.id.editTextText1)
        var etTime = findViewById<EditText>(R.id.editText1)
        etTime.setOnClickListener{
            ShowTimePickerDialog()
        }
        etDate.setOnClickListener{
            showDatePickerDialog()
        }

        //Se vincula el botón por su ID
        val button = findViewById<TextView>(R.id.button2)

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
        etDate.setText("$day/$month/$year")
    }

    private fun ShowTimePickerDialog(){
        val timePicker = TimerPickerFragment{OnTimeSelected(it)}
        timePicker.show(supportFragmentManager, "time")
    }

    private fun OnTimeSelected(time:String){

    }


}