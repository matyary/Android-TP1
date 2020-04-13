package com.utn.tp1

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var txt : TextView
    lateinit var pb1 : Button
    lateinit var pb2 : Button
    lateinit var pb3 : Button
    lateinit var pb4 : Button
    lateinit var pb5 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.texto)
        pb1 = findViewById(R.id.boton_1)
        pb2 = findViewById(R.id.boton_2)
        pb3 = findViewById(R.id.boton_3)
        pb4 = findViewById(R.id.boton_4)
        pb5 = findViewById(R.id.boton_5)

        pb1.setOnClickListener {
            txt.text = "Texto Cambiado"
        }

        pb2.setOnClickListener {
            txt.setText("")
        }

        pb3.setOnClickListener {
            txt.setTextSize(TypedValue.COMPLEX_UNIT_SP, (txt.getTextSize())/(getResources().getDisplayMetrics().scaledDensity) +1)
        }

        pb4.setOnClickListener {
            txt.setTextColor(Color.CYAN)
        }

        pb5.setOnClickListener {
            txt.setTextSize(TypedValue.COMPLEX_UNIT_SP, (txt.getTextSize())/(getResources().getDisplayMetrics().scaledDensity) -1)
        }
    }
}
