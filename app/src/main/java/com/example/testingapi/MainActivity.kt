package com.example.testingapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.testingapi.util.EndPointData
import com.example.testingapi.util.Inserting
import retrofit2.*

class MainActivity : AppCompatActivity() {

    private lateinit var textResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workingApi()
        textResultado = findViewById(R.id.txtResult)
    }

    fun workingApi(){
        val requestApi = Inserting.getRetrofit("https://catfact.ninja")
        val endPoint = requestApi.create(InterfaceApi::class.java)
        endPoint.funcaoGet().enqueue(object : Callback<EndPointData>{
            override fun onResponse(call: Call<EndPointData>, response: Response<EndPointData>) {
                textResultado.text = response.body().toString()
            }

            override fun onFailure(call: Call<EndPointData>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })
    }

}