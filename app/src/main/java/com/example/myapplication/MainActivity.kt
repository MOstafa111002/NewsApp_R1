package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.api.ApiManger
import com.example.myapplication.model.SourcesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ApiManger.getApi().getSources("25eacc7acbb74155b6b902f8cee0d041")
    }
    fun getSources(){
   ApiManger.getApi().getSources(Constants.apiKey)
       .enqueue(object :Callback<SourcesResponse>{
           override fun onResponse(
               call: Call<SourcesResponse>,
               response: Response<SourcesResponse>
           ) {
               TODO("Not yet implemented")
           }

           override fun onFailure(call: Call<SourcesResponse>, t: Throwable) {
               TODO("Not yet implemented")
           }


       })

    }
}