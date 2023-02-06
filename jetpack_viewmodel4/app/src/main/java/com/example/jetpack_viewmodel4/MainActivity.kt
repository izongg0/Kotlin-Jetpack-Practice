package com.example.jetpack_viewmodel4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// ViewModelFactory
// Activity에서 수정된 값을 ViewModel로 전달

class MainActivity : AppCompatActivity() {
    lateinit var viewmodel: MainViewModel
    lateinit var viewModelFactory : MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelFactory = MainViewModelFactory(5000)
        viewmodel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
    }
}