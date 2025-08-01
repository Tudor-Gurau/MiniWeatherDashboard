package com.example.miniweatherdashboard.data.repository

import android.content.Context
import android.util.Log
import com.example.miniweatherdashboard.data.api.WeatherApiService
import com.example.miniweatherdashboard.data.model.WeatherResponse
import com.example.miniweatherdashboard.domain.model.WeatherInfo
import com.tudor.weatherappcompose.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WeatherRepository(
    private val apiService: WeatherApiService,
    private val context: Context
) {
    private val apiKey = context.getString(R.string.weather_api_key)

    suspend fun getWeatherByCity(cityName: String): Result<WeatherInfo> = withContext(Dispatchers.IO) {
        try {
            Log.d("WeatherRepository", "Making API call for city: $cityName")
            val weatherResponse = apiService.getWeatherByCity(cityName, apiKey)
            Log.d("WeatherRepository", "API Response received successfully")
            
            // Map the API response to domain model
            val weatherInfo = WeatherInfo(
                cityName = weatherResponse.location.name,
                region = weatherResponse.location.region,
                country = weatherResponse.location.country,
                temperature = weatherResponse.current.temp_c,
                condition = weatherResponse.current.condition.text,
                feelsLike = weatherResponse.current.feelslike_c,
                humidity = weatherResponse.current.humidity,
                windSpeed = weatherResponse.current.wind_kph
            )
            
            Log.d("WeatherRepository", "Mapped to domain model: $weatherInfo")
            Result.success(weatherInfo)
            
        } catch (e: Exception) {
            Log.e("WeatherRepository", "API call failed for city: $cityName", e)
            Result.failure(e)
        }
    }
} 