package com.example.jetpack_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val customAdapter = CustomAdapter(array)
        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)



    }
}