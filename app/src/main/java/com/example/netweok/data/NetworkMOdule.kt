package com.example.netweok.data

import com.google.gson.internal.GsonBuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object NetworkModule {
  private  lateinit var instance: Retrofit
   private val loggingInterceptor= HttpLoggingInterceptor().apply{
      level=HttpLoggingInterceptor.Level.BODY

  }

    fun getInstance():Retrofit {
        if(!::instance.isInitialized)
        {
            val okHttpClient=OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build()

            val builder=Retrofit.Builder()
                .baseUrl("https://cat-fact.herokuapp.com")

             if(BuildConfig.DEBUG) // the error is here
             {
                 builder.client(okHttpClient)

             }
            instance=builder.build()
        }
        return instance
    }



    fun getApiSerive():ApiService = getInstance().create(ApiService::class.java)



}