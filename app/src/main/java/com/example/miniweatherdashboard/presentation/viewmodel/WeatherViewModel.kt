package com.example.miniweatherdashboard.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.miniweatherdashboard.data.local.WeatherPreferences
import com.example.miniweatherdashboard.data.repository.WeatherRepository
import com.example.miniweatherdashboard.domain.model.WeatherInfo
import com.example.miniweatherdashboard.presentation.ui.model.WeatherUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val preferences: WeatherPreferences
) : ViewModel() {

    private val _uiState = MutableStateFlow<WeatherUiState>(WeatherUiState.Initial)
    val uiState: StateFlow<WeatherUiState> = _uiState.asStateFlow()

    private val _lastSearchedCity = MutableStateFlow<String>("")
    val lastSearchedCity: StateFlow<String> = _lastSearchedCity.asStateFlow()

    init {
        loadLastSearchedCity()
    }

    fun searchWeather(cityName: String) {
        if (cityName.isBlank()) return

        viewModelScope.launch {
            _uiState.value = WeatherUiState.Loading
            
            repository.getWeatherByCity(cityName).fold(
                onSuccess = { weatherInfo ->
                    _uiState.value = WeatherUiState.Success(weatherInfo)
                    saveLastSearchedCity(cityName)
                },
                onFailure = { exception ->
                    _uiState.value = WeatherUiState.Error(exception.message ?: "Unknown error occurred")
                }
            )
        }
    }

    private fun saveLastSearchedCity(cityName: String) {
        viewModelScope.launch {
            preferences.saveLastSearchedCity(cityName)
            _lastSearchedCity.value = cityName
        }
    }

    private fun loadLastSearchedCity() {
        viewModelScope.launch {
            val lastCity = preferences.getLastSearchedCity()
            if (lastCity?.isNotEmpty() == true) {
                _lastSearchedCity.value = lastCity
            }
        }
    }
} 