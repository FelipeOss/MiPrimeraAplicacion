package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)



        /**
         * array
         */

        val opcionesSpinner = arrayOf(
            "Sumar"
            , "Restar"
            , "Multiplicar"
            , "Hola Mundo"
            , "Dividir"
        )

        //adaptador de Array
        val adaptador = ArrayAdapter(this //contexto
                , android.R.layout.simple_list_item_1 //elementos listview
                , opcionesSpinner) //objeto spinner

        //
        spOperacionesMat.adapter = adaptador



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}