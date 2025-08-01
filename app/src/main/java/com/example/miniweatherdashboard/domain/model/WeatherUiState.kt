package com.example.miniweatherdashboard.domain.model

import com.example.miniweatherdashboard.data.model.WeatherResponse

sealed class WeatherUiState {
    object Loading : WeatherUiState()
    data class Success(val weather: WeatherResponse) : WeatherUiState()
    data class Error(val message: String) : WeatherUiState()
    object Initial : WeatherUiState()
} 