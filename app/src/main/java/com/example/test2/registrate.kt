package com.example.test2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

class registrate : AppCompatActivity() {

    var usernameRegistro: EditText? = null
    var passwordRegistro: EditText? = null
    var nombreRegistro: EditText? = null
    var apellidoRegistro: EditText? = null
    var emailRegistro: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrate)

        usernameRegistro = findViewById(R.id.editTextTextName) as EditText
        passwordRegistro = findViewById(R.id.editTextTextLastname) as EditText
        nombreRegistro = findViewById(R.id.editTextTextEmail) as EditText
        apellidoRegistro = findViewById(R.id.editTextTextPersonName) as EditText
        emailRegistro = findViewById(R.id.editTextTextPassword) as EditText

        var getUsernameR: String? = null
        var getPasswordR: String? = null
        var getNombreR: String? = null
        var getApellidoR: String? = null
        var getEmailR: String? = null



        var botonRegistro : TextView = findViewById(R.id.txtSignUp)

        botonRegistro.setOnClickListener{
            getUsernameR = usernameRegistro!!.text.toString()
            getPasswordR = passwordRegistro!!.text.toString()
            getNombreR = nombreRegistro!!.text.toString()
            getApellidoR = apellidoRegistro!!.text.toString()
            getEmailR = emailRegistro!!.text.toString()

            println("HOOOOOOOOOOOOOOOLA")
            val fileName = "app/base.apk/assets/loginDetails.csv"
            //val myFile = File(fileName)

            val contenido = getUsernameR +"," + getPasswordR + "," + getNombreR + "," + getApellidoR +","+ getEmailR


            try{
                val file = File(fileName)

                val fw = FileWriter(fileName)
                val bw = BufferedWriter(fw)
                bw.write(contenido)
                bw.close()

                println(contenido)

                val intent = Intent(this, login::class.java)
                startActivity(intent)

            }catch (e: java.io.FileNotFoundException){
                println("NOT FOUNDDDDDDDDDDDDDDD")
            }
        }
    }
}