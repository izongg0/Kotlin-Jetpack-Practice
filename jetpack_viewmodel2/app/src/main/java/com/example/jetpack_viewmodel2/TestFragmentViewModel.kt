package com.example.jetpack_viewmodel2

import android.util.Log
import androidx.lifecycle.ViewModel

class TestFragmentViewModel : ViewModel() {

    var countValue = 0

    fun plus(){
        countValue++
        Log.d("apdlsqb",countValue.toString())

    }
    fun minus(){
        countValue--
        Log.d("apdlsqb",countValue.toString())

    }
    fun getCount() : Int {
        return countValue
    }

}