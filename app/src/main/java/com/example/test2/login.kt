package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.nio.channels.AsynchronousFileChannel.open
import java.nio.channels.DatagramChannel.open
import java.util.ArrayList


class login : AppCompatActivity() {

    var username: EditText? = null
    var password: EditText? = null
    var go: Button? = null
    var getUser: String? = null
    var getPass: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        username = findViewById<View>(R.id.editTextTextPersonName) as EditText
        password = findViewById<View>(R.id.editTextTextPassword) as EditText
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

        val userData: MutableList<User> = ArrayList()
        var reader: BufferedReader? = null
        try {
            getUser = username!!.text.toString()
            getPass = password!!.text.toString()
            reader = BufferedReader(InputStreamReader(assets.open("loginDetails.csv"), "UTF-8"))
            reader.readLine()
            var line = ""
            while (reader.readLine().also { line = it } != null) {
                val token = line.split(",").toTypedArray()
                if (token.size > 0) {
                    val data = User()
                    data.setId(token[0].toInt())
                    data.setUsername(token[1])
                    data.setPassword(token[2])
                    userData.add(data)
                    Log.d("Activity", "" + data)
                    println(data)
                    println("HHHHHHHOLA")
                    var i: Int
                    i = 0
                    while (i < userData.size) {
                        if (data.username == getUser && data.password == getPass) {
                            Toast.makeText(
                                applicationContext,
                                "Password and Username is Correct",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                        i++
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    @Throws(IOException::class)
    fun goPressed(view: View?) {
        val userData: MutableList<User> = ArrayList()
        var reader: BufferedReader? = null
        try {
            getUser = username!!.text.toString()
            getPass = password!!.text.toString()
            reader = BufferedReader(InputStreamReader(assets.open("loginDetails.csv"), "UTF-8"))
            reader.readLine()
            var line = ""
            while (reader.readLine().also { line = it } != null) {
                val token = line.split(",").toTypedArray()
                if (token.size > 0) {
                    val data = User()
                    data.setId(token[0].toInt())
                    data.setUsername(token[1])
                    data.setPassword(token[2])
                    userData.add(data)
                    Log.d("Activity", "" + data)
                    println(data)
                    println("HHHHHHHOLA")
                    var i: Int
                    i = 0
                    while (i < userData.size) {
                        if (data.username == getUser && data.password == getPass) {
                            Toast.makeText(
                                applicationContext,
                                "Password and Username is Correct",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                        i++
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
            println("HHHHHHHOLA")
        }
    }



}