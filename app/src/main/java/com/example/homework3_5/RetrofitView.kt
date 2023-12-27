package com.example.homework3_5

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitView {

    val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(PixaApi::class.java)
}