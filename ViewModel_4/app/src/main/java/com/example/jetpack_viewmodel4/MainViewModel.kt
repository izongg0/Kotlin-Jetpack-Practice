package com.example.jetpack_viewmodel4

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num : Int) : ViewModel() {

    // Repository
    // 네트워크 통신을 하거나

    // LocalDB (Room SQLite)

    init{
        Log.d("MainViewModel",num.toString())
    }
}