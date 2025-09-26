package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miprimeraaplicacion.ApiRegiones.CargarRegionComunaAPI

class SpinnerRegionComuna : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner_region_comuna)

        val spRegion: Spinner = findViewById(R.id.sp_region)
        val spComuna: Spinner = findViewById(R.id.sp_comuna)
        val btnHacerAlgo: Button = findViewById(R.id.btn_hacer_algo)

        // CargarAlumnosAPI.cargarAlumnos(this, listaAlumnos)

        CargarRegionComunaAPI.cargarRegionComuna(this,spRegion)
        CargarRegionComunaAPI.cargarRegionComuna2(this, spComuna)


        val imageView = findViewById<ImageView>(R.id.imageView)
        Glide.with(this)
            .asGif()
            .load("file:///android_asset/gif_3.gif")
            .error(R.drawable.ic_launcher_foreground) // Shows if loading fails
            .into(imageView)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}