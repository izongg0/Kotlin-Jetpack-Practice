package com.example.jetpack_fragdata1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel1: ViewModel() {
    private var mutableCount = MutableLiveData(0)
    val liveCount : LiveData<Int>
    get() = mutableCount

    fun plusCountValue(){
        mutableCount.value = mutableCount.value?.plus(1)

    }
}