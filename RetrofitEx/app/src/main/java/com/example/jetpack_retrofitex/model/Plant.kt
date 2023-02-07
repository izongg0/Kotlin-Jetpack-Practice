package com.example.jetpack_retrofitex.model

data class Plant (

    val plantId : String,
    val name : String,
    val description : String,
    val growZoneNumber : Int,
    val wateringInterval : Int,
    var imageurl : String
        )