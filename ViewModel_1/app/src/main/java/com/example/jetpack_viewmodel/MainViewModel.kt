package com.example.jetpack_viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
//ViewModel 에서 저렇게 아래와 같이 딸랑 변수하나만 만들어서
//사용하지는 않고, LiveData(등등)을 이용해서 함께 씀

// 밑에는 예제일 뿐
class MainViewModel : ViewModel(){

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