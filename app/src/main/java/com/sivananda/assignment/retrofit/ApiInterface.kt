package com.sivananda.assignment.retrofit

import com.sivananda.assignment.model.ResultsItem
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {

    @GET("/api/0.4/?randomapi")
    fun getProfiles(): Call<List<ResultsItem>>

}