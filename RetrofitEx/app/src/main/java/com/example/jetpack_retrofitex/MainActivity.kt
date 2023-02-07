package com.example.jetpack_retrofitex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack_retrofitex.adapter.CustomAdapter
import com.example.jetpack_retrofitex.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java
        )
        viewModel.getAllData()

        val rv = findViewById<RecyclerView>(R.id.rv)

        viewModel.result.observe(this,{
            val customAdapter = CustomAdapter(this,it)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)


        })
    }
}