package com.example.m3_hw_8

class Flowers( var title: String? = null, var message: String? = null, var image: Int? = null) {

    fun getImage(): Int {
        return image!!
    }
    @JvmName("getTitle1")
    fun getTitle(): String? {
        return title
    }

    @JvmName("getMessage1")
    fun getMessage(): String? {
        return message
    }

}