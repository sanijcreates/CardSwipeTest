package com.example.cardswipetestmain

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private val cardList: List<Card>) : RecyclerView.Adapter<CardAdapter.viewHolder> (){
    inner class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<AppCompatImageView>(R.id.image)
        val content = itemView.findViewById<AppCompatTextView>(R.id.content)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.viewHolder {
        val context = parent.context
        val inflator = LayoutInflater.from(context)
        val imgView = inflator.inflate(R.layout.card, parent, false)
        return viewHolder(imgView)
    }

    override fun onBindViewHolder(holder: CardAdapter.viewHolder, position: Int) {
        val card: Card = cardList[position]
        val contentView = holder.content
        contentView.setText(card.getContent())
        val imageView = holder.image
        imageView.setImageDrawable(card.getImage())
    }

    override fun getItemCount(): Int {
        return cardList.size
    }
}