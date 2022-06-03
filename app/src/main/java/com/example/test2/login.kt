package com.example.test2

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import user
import java.io.BufferedReader
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser

class login : AppCompatActivity() {

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var getUsername: String
    lateinit var getPassword: String

    @RequiresApi(Build.VERSION_CODES.O)
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

        username = findViewById(R.id.editTextTextPersonName)
        password = findViewById(R.id.editTextTextPassword)
        println(Paths.get("Test/Documents/GitHub/Interfaces_v5/app/src/main/java/login.csv").toAbsolutePath())
        println(Paths.get)
        val reader = Files.newBufferedReader(Paths.get("../login.csv").toAbsolutePath())
        val csvParser = CSVParser(reader, CSVFormat.DEFAULT)
        for (csvRecord in csvParser) {
            // Accessing Values by Column Index
            getUsername = csvRecord.get(0)
            getPassword = csvRecord.get(1)
            // print the value to console
            System.out.println("Record No - " + csvRecord.getRecordNumber())
            println("---------------")
            println("Usuario : $getUsername")
            println("Pass : $getPassword")
            println("---------------")
        }
    }



    @RequiresApi(Build.VERSION_CODES.O)
    fun login(view:View){
        val reader = Files.newBufferedReader(Paths.get("java/login.csv"))
        val csvParser = CSVParser(reader, CSVFormat.DEFAULT)
        for (csvRecord in csvParser) {
            // Accessing Values by Column Index
            getUsername = csvRecord.get(0)
            getPassword = csvRecord.get(1)
            // print the value to console
            System.out.println("Record No - " + csvRecord.getRecordNumber())
            println("---------------")
            println("Usuario : $getUsername")
            println("Pass : $getPassword")
            println("---------------")
        }
    }
}