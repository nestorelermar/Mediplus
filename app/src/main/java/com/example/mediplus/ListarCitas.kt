package com.example.mediplus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListarCitas: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_citas)

        val buttonMenu = findViewById<ImageView>(R.id.button_menu)
        buttonMenu.setOnClickListener { view ->
            // Infla el diseño del PopupWindow
            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.popup_layout, null)

            // Crea el PopupWindow
            val popupWindow = PopupWindow(popupView, 260, WindowManager.LayoutParams.WRAP_CONTENT, true)

            // Establece las acciones de los ítems
            popupView.findViewById<TextView>(R.id.edit).setOnClickListener {
                Toast.makeText(this, "editar", Toast.LENGTH_SHORT).show()
                true
            }
            popupView.findViewById<TextView>(R.id.delete).setOnClickListener {
                Toast.makeText(this, "eliminar", Toast.LENGTH_SHORT).show()
                true
            }
            popupView.findViewById<TextView>(R.id.info).setOnClickListener {
                Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show()
                true
            }
}}}