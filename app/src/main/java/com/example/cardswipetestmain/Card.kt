package com.example.cardswipetestmain

import android.graphics.drawable.Drawable

class Card(private val content: String, private val image: Drawable) {
    fun getContent():String {
        return content
    }
    fun getImage():Drawable {
        return image
    }
 }