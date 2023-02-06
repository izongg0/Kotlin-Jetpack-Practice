package com.example.jetpack_retrofitex.repository

import com.example.jetpack_retrofitex.api.MyApi
import com.example.jetpack_retrofitex.api.RetrofitInstance
import com.example.jetpack_retrofitex.model.Plant

class Repository {

    private val client = RetrofitInstance.getInstance().create(MyApi::class.java)

    suspend fun getAllPlants() =  client.getAllPlants()
}