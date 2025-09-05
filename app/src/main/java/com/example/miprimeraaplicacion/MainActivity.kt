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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edUsername:EditText = findViewById(R.id.ed_username)
        val edPasswd:EditText = findViewById(R.id.ed_passwd)
        val btnLogin:Button = findViewById(R.id.btn_login)
        val txMessage:TextView = findViewById(R.id.tx_message)

        var defUsername = "Fefo"
        var defPasswd = "admin123"

        /**
         * Boton Login
         */
        btnLogin.setOnClickListener {
            if(edUsername.text.toString() == defUsername.toString()
                && edPasswd.text.toString() == defPasswd.toString()){

                val  newWindow = Intent(this, MainActivity2::class.java)

                newWindow.putExtra("par_usern", edUsername.text.toString())

                startActivity(newWindow)



            }else{}
            txMessage.text = "error USER/PASSWORD"
            //txMessage.text = edUsername.text.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}