package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var boton : TextView = findViewById(R.id.txtLogin)

        boton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var boton2 : TextView = findViewById(R.id.txtRegistrate)

        boton2.setOnClickListener{
            val intent = Intent(this, registrate::class.java)
            startActivity(intent)
        }
    }
}