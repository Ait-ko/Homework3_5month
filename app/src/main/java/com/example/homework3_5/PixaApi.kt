package com.example.homework3_5

import com.example.PixaModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {

    @GET("api/")

    fun getImages(
        @Query("q") keyWord: String,
        @Query("key") key: String = "41491340-e1f3494149dbcddcac6a792ea",
        @Query("page") page: Int,
        @Query("per_page") perPage: Int = 3
    ): Call<PixaModel>
}