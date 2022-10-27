package com.example.testingapi.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Inserting {
    companion object {
        fun getRetrofit(path: String): Retrofit {
            return Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}