package com.example.test2

import java.io.Serializable

class User() : Serializable {
    var username: String? = null
    var password: String? = null
    var nombre: String? = null
    var apellido: String? = null
    var email: String? = null



    @JvmName("getUsername1")
    fun getUsername(): String? {
        return username
    }

    @JvmName("setUsername1")
    fun setUsername(username: String?) {
        this.username = username
    }

    @JvmName("getPassword1")
    fun getPassword(): String? {
        return password
    }

    @JvmName("setPassword1")
    fun setPassword(password: String?) {
        this.password = password
    }

    @JvmName("getNombre1")
    fun getNombre(): String? {
        return nombre
    }

    @JvmName("setNombre1")
    fun setNombre(nombre: String?) {
        this.nombre = nombre
    }
    @JvmName("getApellido1")
    fun getApellido(): String? {
        return apellido

    }

    @JvmName("setApellido1")
    fun setApellido(apellido: String?) {
        this.apellido = apellido
    }
    @JvmName("getEmail1")
    fun getEmail(): String? {
        return email
    }

    @JvmName("setEmail1")
    fun setEmail(email: String?) {
        this.email = email
    }

    override fun toString(): String {
        return "User{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}'
    }
}