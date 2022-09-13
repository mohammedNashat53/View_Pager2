package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImagesAdapter (val images: List<Int>): RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>() {

    inner class ImagesViewHolder (view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ImagesViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        holder.itemView.findViewById<ImageView>(R.id.image_view).setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return  images.size
    }
}