package com.example.test2

import java.io.Serializable

class User : Serializable {
    var id = null
    var username: String? = null
    var password: String? = null
    fun getId(): Int {
        return id!!
    }

    fun setId(id: Int) {
        this.id = null
    }
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
    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'
    }
}