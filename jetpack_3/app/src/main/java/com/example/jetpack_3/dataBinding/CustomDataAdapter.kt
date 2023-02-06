package com.example.jetpack_3.dataBinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack_3.CustomAdapter
import com.example.jetpack_3.R
import com.example.jetpack_3.databinding.TextRowItemBinding
//import com.example.jetpack_3.viewBinding.CustomViewAdapter

class CustomDataAdapter(private val dataSet : ArrayList<String>) : RecyclerView.Adapter<CustomDataAdapter.ViewHolder>(){

    class ViewHolder(binding : TextRowItemBinding): RecyclerView.ViewHolder(binding.root){

        val myText : TextView = binding.myText

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

//        val view = TextRowItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        val view = DataBindingUtil.inflate<TextRowItemBinding>(LayoutInflater.from(parent.context),R.layout.text_row_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myText.text = dataSet[position]
    }

}