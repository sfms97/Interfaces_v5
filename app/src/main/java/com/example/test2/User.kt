package com.example.test2

import java.io.Serializable

class User : Serializable {
    var id = 0
    var username: String? = null
    var password: String? = null


    @JvmName("getId1")
    fun getId(): Int {
        return id
    }

    @JvmName("setId1")
    fun setId(id: Int) {
        this.id = id
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