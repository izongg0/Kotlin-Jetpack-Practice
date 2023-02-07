package com.example.jetpack_coroutine1

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondViewModel : ViewModel() {

    fun a(){

        CoroutineScope(Dispatchers.IO).launch{
            //SecondActivity에서 빠져나오면 중지되어야함
            for(i in 0..10){
                delay(1000)
                Log.d("SecondView A",i.toString())
            }
        }
    }

    fun b() {
        viewModelScope.launch {
            // viewModelScope 를 사용할 시, 뷰모델에서 빠져나오면 중지가 됨.
            for (i in 11..20) {
                delay(1000)
                Log.d("SecondView B", i.toString())
            }
        }
    }

}