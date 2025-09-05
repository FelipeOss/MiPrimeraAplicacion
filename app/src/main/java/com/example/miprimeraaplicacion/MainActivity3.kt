package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miprimeraaplicacion.utils.OpMatematicas

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val edopUno: EditText = findViewById(R.id.ed_opUno)
        val edopDos: EditText = findViewById(R.id.ed_opDos)
        val btnCalculo: Button = findViewById(R.id.btn_calculo)
        val backButton: Button = findViewById(R.id.btn_Back)
        val txResultado: TextView = findViewById(R.id.tx_resultado)

        btnCalculo.setOnClickListener {
            var numeroUno:Int = edopUno.text.toString().toIntOrNull() ?: 0
            var numeroDos:Int = edopDos.text.toString().toIntOrNull() ?: 0

            txResultado.text = OpMatematicas.dividirValores(numeroUno,numeroDos)
        }
        backButton.setOnClickListener {
            val  newWindow = Intent(this, MainActivity2::class.java)
            startActivity(newWindow)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
