package com.example.conversationoptions.services

import com.example.conversationoptions.models.MyCompliment
import com.example.conversationoptions.models.MyInsult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface InsultService {
    @GET("generate_insult.php")

    fun getInsultsList (@Query("lang")lang:String, @Query("type")type:String) : Call<MyInsult>
}