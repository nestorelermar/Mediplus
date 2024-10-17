package com.example.mediplus

import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Field
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.PopupWindow
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListarModuloMedicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_modulo_medicamentos)

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

            // Muestra el PopupWindow cerca del botón
            popupWindow.showAsDropDown(view, -20, 200)
        }

        // Dentro de tu método onCreate o Fragmento
        /*val buttonMenu = findViewById<ImageView>(R.id.button_menu)

        buttonMenu.setOnClickListener { view ->
            // Crear el PopupMenu
            val popupMenu = PopupMenu(this, view)
            popupMenu.menuInflater.inflate(R.menu.menu_opciones, popupMenu.menu)

            // Forzar a que se muestren los íconos usando reflexión
            try {
                val fields: Array<Field> = popupMenu.javaClass.declaredFields
                for (field in fields) {
                    if (field.name == "mPopup") {
                        field.isAccessible = true
                        val menuPopupHelper = field.get(popupMenu)
                        val classPopupHelper = Class.forName(menuPopupHelper.javaClass.name)
                        val setForceIcons = classPopupHelper.getMethod("setForceShowIcon", Boolean::class.java)
                        setForceIcons.invoke(menuPopupHelper, true)
                        break
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            // Manejar el clic en las opciones del menú
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.edit -> {
                        // Acción para editar
                        Toast.makeText(this, "Editar seleccionado", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.delete -> {
                        // Acción para eliminar
                        Toast.makeText(this, "Eliminar seleccionado", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.info -> {
                        // Acción para ver información
                        Toast.makeText(this, "Ver info seleccionado", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }

            // Mostrar el menú
            popupMenu.show()
        }*/

    }
}
