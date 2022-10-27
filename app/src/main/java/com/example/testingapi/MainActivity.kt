package com.example.testingapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testingapi.util.Inserting
import com.google.api.Endpoint
import com.google.gson.JsonObject
import retrofit2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workingApi()

    }

    fun workingApi(){
        val requestApi = Inserting.getRetrofit("https://catfact.ninja")
        val endPoint = requestApi.create(InterfaceApi::class.java)
        endPoint.funcaoGet().enqueue(object : retrofit2.Callback<JsonObject>{
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                val muList = mutableListOf<String>()

                response.body()?.keySet()?.iterator()?.forEach {
                    muList.add(it)
                }
                print(muList.count())
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}