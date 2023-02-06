package com.example.jetpack_retrofitex.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpack_retrofitex.api.MyApi
import com.example.jetpack_retrofitex.api.RetrofitInstance
import com.example.jetpack_retrofitex.model.Plant
import com.example.jetpack_retrofitex.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

//    val retrofitInstance : MyApi = RetrofitInstance.getInstance().create(MyApi::class.java)
    private val repository = Repository()

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
    get()=_result

    fun getAllData() = viewModelScope.launch{

        _result.value = repository.getAllPlants()
    }

}