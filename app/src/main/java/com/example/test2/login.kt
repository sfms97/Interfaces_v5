package com.example.test2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.*


class login : AppCompatActivity() {

    var username: EditText? = null
    var password: EditText? = null
    var getUsername1: String? = null
    var getPassword1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        username = findViewById<View>(R.id.editTextTextPersonName) as EditText
        password = findViewById<View>(R.id.editTextTextPassword) as EditText
        var boton: TextView = findViewById(R.id.txtLogin)
        boton.setOnClickListener {
            val userData: MutableList<User> = ArrayList()
            var reader: BufferedReader? = null

            println("HOLA")

            try {
                getUsername1 = username!!.text.toString()
                getPassword1 = password!!.text.toString()
                val fileName = "loginDetails.csv"
                println(getUsername1)
                println(getPassword1)

                reader = BufferedReader(InputStreamReader(assets.open(fileName), "UTF-8"))
                reader.readLine()
                var line = ""
                try{
                    while (reader.readLine().also {
                            line = it } != null) {
                        val token = line.split(",").toTypedArray()
                        if (token.size > 0 && token != null) {
                            val data = User()
                            data.setUsername(token[0])
                            data.setPassword(token[1])
                            userData.add(data)
                            println(data)
                            var i: Int
                            i = 0
                            println(userData.get(0).getUsername())
                            while (i < userData.size) {
                                if (userData.get(i).getUsername() == getUsername1 && userData.get(i).getPassword() == getPassword1) {
                                    println("Valores correctos")
                                    val intent = Intent(this, MainActivity::class.java)
                                    startActivity(intent)
                                    onStop()
                                }
                                i++
                            }
                        }
                    }
                }catch(e: java.lang.NullPointerException){
                    println("No hay mas texto para leer")
                }

            } catch (e: IOException) {
                e.printStackTrace()
                println("No hay mas lineas")
            }

        }

        var boton2: TextView = findViewById(R.id.txtRegistrate)

        boton2.setOnClickListener {
            val intent = Intent(this, registrate::class.java)
            startActivity(intent)
        }

    }




}