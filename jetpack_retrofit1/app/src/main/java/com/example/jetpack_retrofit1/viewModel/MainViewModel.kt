package com.example.jetpack_retrofit1.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpack_retrofit1.api.MyApi
import com.example.jetpack_retrofit1.api.RetrofitInstance
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val retrofitInstance = RetrofitInstance.getInstance().create(MyApi::class.java)

    private var mutableWord1 = MutableLiveData<String>()
    val liveWord1 : LiveData<String>
    get() = mutableWord1

    private var mutableWord2 = MutableLiveData<String>()
    val liveWord2 : LiveData<String>
        get() = mutableWord2

    fun getPost1() = viewModelScope.launch {  // retroit 에서 데이터를 받아옴

        val post = retrofitInstance.getPost1()
        Log.d("MainViewModel",post.toString())
        mutableWord1.value = post.title


    }
    fun getPostNumber(number : Int) = viewModelScope.launch{// retroit 에서 데이터를 받아옴

        val post = retrofitInstance.getPostNumber(number)
        Log.d("MainViewModel",post.toString())
        mutableWord2.value = post.title


    }
}