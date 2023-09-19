package com.example.myapplication.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManger {
    companion object{

       private var retrofit:Retrofit?=null
       private fun getInstance():Retrofit{

            if (retrofit==null){
                retrofit=Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            }
         return retrofit!!;

        }
        fun getApi():webservices{
            return getInstance().create(webservices::class.java)
        }
    }
}