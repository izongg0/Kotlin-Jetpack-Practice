package com.example.jetpack_retrofitex.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jetpack_retrofitex.R
import com.example.jetpack_retrofitex.model.Plant

class CustomAdapter(val context : Context, val dataset:List<Plant> ) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val textView : TextView = view.findViewById(R.id.textArea)
        val imageView : ImageView = view.findViewById(R.id.imageArea)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataset[position].name
        Glide.with(context)
            .load(dataset[position].imageurl)
            .into(holder.imageView)
    }

}