package com.example.conversationoptions.services

import com.example.conversationoptions.models.MyCompliment
import com.example.conversationoptions.models.MyInsult
import retrofit2.Call
import retrofit2.http.GET

interface ComplimentService {
    @GET("api")

    fun getComplimentsList () : Call<MyCompliment>
}