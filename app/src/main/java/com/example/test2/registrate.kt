package com.example.test2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.*
import com.opencsv.CSVWriter
import java.nio.charset.StandardCharsets
import com.opencsv.bean.ColumnPositionMappingStrategy
import com.opencsv.bean.StatefulBeanToCsv
import com.opencsv.bean.StatefulBeanToCsvBuilder
import java.util.*
import kotlin.collections.ArrayList


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

            //val myFile = File(fileName)

            val contenido = arrayOf(getUsernameR, getPasswordR , getNombreR ,getApellidoR, getEmailR)

            var reader1: BufferedReader? = null
            val userData: MutableList<User> = ArrayList()

            //try{
                /*val data = User()
                val fileName = "loginDetails"
                var reader = InputStreamReader(assets.open(fileName), "UTF-8")
                reader1 = BufferedReader(reader)

                val file = File(reader.toString())
                var fileWriter: FileWriter?=null
                var csvWriter: CSVWriter? = null
                var beanToCsv: StatefulBeanToCsv<User>?

                fileWriter = FileWriter(fileName)
                csvWriter = CSVWriter(fileWriter,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)

                csvWriter.writeNext(contenido)*/



                /*FileOutputStream(fileName).use {fos ->
                OutputStreamWriter(fos, StandardCharsets.UTF_8).use{ osw ->
                    CSVWriter(osw).use { writer ->
                        writer.writeNext(contenido)
                    }
                }

            }*/
                //reader1 = BufferedReader(InputStreamReader(assets.open(fileName), "UTF-8"))
                //reader1.readLine()
                println("encuentra")

               /* val file = File(fileName)
                val fw = FileWriter(contenido)
                val bw = BufferedWriter(fw)
                bw.write(contenido)
                bw.close()

                println(contenido)*/

                val intent = Intent(this, login::class.java)
                startActivity(intent)

           /* }catch (e: java.io.FileNotFoundException){
                println("NOT FOUNDDDDDDDDDDDDDDD")
            }*/
        }
    }


}