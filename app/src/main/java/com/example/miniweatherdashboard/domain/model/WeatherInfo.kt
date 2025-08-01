package com.example.miniweatherdashboard.domain.model

data class WeatherInfo(
    val cityName: String,
    val region: String,
    val country: String,
    val temperature: Double,
    val condition: String,
    val feelsLike: Double,
    val humidity: Int,
    val windSpeed: Double
) 