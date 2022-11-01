package com.example.testingapi

import com.example.testingapi.util.EndPointData
import retrofit2.Call
import retrofit2.http.GET

interface InterfaceApi {
    @GET("/fact")
    fun funcaoGet(): Call<EndPointData>
}