package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val txUser:TextView = findViewById(R.id.logged_user)
        val btnCalculator: Button = findViewById(R.id.btn_calculator)
        val getUsernameS = intent.getStringExtra("par_usern")
        val btnMenu1: Button = findViewById(R.id.btn_menu1)
        val btnSpinner: Button = findViewById(R.id.btn_spinner)
        txUser.text = getUsernameS.toString()



        btnCalculator.setOnClickListener {
            val  newWindow = Intent(this, MainActivity3::class.java)
            startActivity(newWindow)
            }
        btnMenu1.setOnClickListener {
            val  newWindow = Intent(this, MainActivity4::class.java)
            startActivity(newWindow)
        }
        btnSpinner.setOnClickListener {
            val  newWindow = Intent(this, MainActivity5::class.java)
            startActivity(newWindow)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}