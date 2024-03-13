package com.chusdevil.llamadootrapantalla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        iniciar()
    }

        private fun iniciar() {
            val boton: Button = findViewById(R.id.boton)
            boton.setOnClickListener {
                val intent = Intent(this, llamadaPagina::class.java)
                startActivity(intent)
            }
    }
}