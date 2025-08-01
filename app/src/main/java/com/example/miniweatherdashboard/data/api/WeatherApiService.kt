package com.example.miniweatherdashboard.data.api

import com.example.miniweatherdashboard.data.model.WeatherResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("current.json")
    suspend fun getWeatherByCity(
        @Query("q") cityName: String,
        @Query("key") apiKey: String
    ): WeatherResponse
    
    @GET("current.json")
    suspend fun getWeatherByCityRaw(
        @Query("q") cityName: String,
        @Query("key") apiKey: String
    ): Response<ResponseBody>
} 