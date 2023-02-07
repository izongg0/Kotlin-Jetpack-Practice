package com.example.jetpack_retrofitex.api

import com.example.jetpack_retrofitex.model.Plant
import retrofit2.http.GET

interface MyApi {

    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants() : List<Plant>
}