package com.example.cardswipetestmain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.CardStackView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardStack = findViewById<CardStackView>(R.id.cardStack)
        val cards = mutableListOf<Card>()
        ResourcesCompat.getDrawable(resources, R.drawable.food1, null)
            ?.let { Card("Honesty is the best policy", it) }?.let { cards.add(it) }
        ResourcesCompat.getDrawable(resources, R.drawable.food2, null)
            ?.let { Card("Honesty is the best policy", it) }?.let { cards.add(it) }
        ResourcesCompat.getDrawable(resources, R.drawable.food3, null)
            ?.let { Card("Honesty is the best policy", it) }?.let { cards.add(it) }

        val adapter = CardAdapter(cards)
        cardStack.layoutManager =  CardStackLayoutManager(applicationContext)
        cardStack.adapter = adapter

    }
}