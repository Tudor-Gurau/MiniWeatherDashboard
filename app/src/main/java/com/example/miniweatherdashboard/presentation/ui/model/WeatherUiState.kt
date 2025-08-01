package com.example.miniweatherdashboard.presentation.ui.model

import com.example.miniweatherdashboard.domain.model.WeatherInfo

sealed class WeatherUiState {
    object Initial : WeatherUiState()
    object Loading : WeatherUiState()
    data class Success(val weather: WeatherInfo) : WeatherUiState()
    data class Error(val message: String) : WeatherUiState()
} 