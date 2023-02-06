package com.example.jetpack_viewmodel4

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(private val num : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(num) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }

}