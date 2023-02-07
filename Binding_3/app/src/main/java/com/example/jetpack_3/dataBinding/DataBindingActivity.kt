package com.example.jetpack_3.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jetpack_3.R
import com.example.jetpack_3.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)


        val array = ArrayList<String>()
        array.add("A")
        array.add("B")
        array.add("C")
        array.add("D")
        array.add("E")
        array.add("A")
        array.add("B")
        array.add("C")
        array.add("D")
        array.add("E")
        array.add("A")
        array.add("B")
        array.add("C")
        array.add("D")
        array.add("E")

        val customDataAdapter = CustomDataAdapter(array)
        val rv = binding.rv
        rv.adapter = customDataAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}