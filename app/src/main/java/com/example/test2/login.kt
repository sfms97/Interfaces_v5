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
    var go: Button? = null
    var getUsername1: String? = null
    var getPassword1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        username = findViewById<View>(R.id.editTextTextPersonName) as EditText
        password = findViewById<View>(R.id.editTextTextPassword) as EditText
        var boton: TextView = findViewById(R.id.txtLogin)
        var go: Button = findViewById(R.id.btnGo)

        go.setOnClickListener {

            val intent = Intent(this, goPressed()::class.java)
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent)
            startActivity(intent2)
        }

        boton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var boton2: TextView = findViewById(R.id.txtRegistrate)

        boton2.setOnClickListener {
            val intent = Intent(this, registrate::class.java)
            startActivity(intent)
        }

/*val userData: MutableList<User> = ArrayList()
var reader: BufferedReader? = null

try {

    geter = username!!.text.toString()
    getPass = password!!.text.toString()

    reader = BufferedReader(InputStreamReader
        (assets.open("java/com/example/test2/loginDetails.csv"), "UTF-8"))
    println("HOLA")
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
}*/
    }


    @Throws(IOException::class)
    fun goPressed() {
        val userData: MutableList<User> = ArrayList()
        var reader: BufferedReader? = null

        println("HOLA")

        try {
            getUsername1 = username!!.text.toString()
            getPassword1 = password!!.text.toString()
            println("entra en try")
            val fileName = "loginDetails.csv"

            /*val inputStream: InputStream = assets.open("login.csv")
            println("lio")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            println("lee")*/

            reader = BufferedReader(InputStreamReader(assets.open(fileName), "UTF-8"))
            reader.readLine()
            println("HOLA2")
            var line = ""
            while (reader.readLine().also { line = it } != null) {
                println("si o que")
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
                        if (data.username == getUsername1 && data.password == getPassword1) {
                            println("Valores correctos")
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
            //println("HHHHHHHOLA")
        }
    }


}