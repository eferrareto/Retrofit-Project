package com.example.testingapi.util

import com.google.gson.annotations.SerializedName

data class EndPointData(

    @SerializedName("fact")
    var fact : String,

    @SerializedName("length")
    var length : Int

)
