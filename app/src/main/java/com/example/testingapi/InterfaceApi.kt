package com.example.testingapi

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface InterfaceApi {
    @GET("/fact")
    fun funcaoGet(): Call<JsonObject>
}