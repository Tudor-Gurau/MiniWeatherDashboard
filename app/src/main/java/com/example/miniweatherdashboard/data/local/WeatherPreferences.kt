package com.example.miniweatherdashboard.data.local

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherPreferences @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(
        PREF_NAME,
        Context.MODE_PRIVATE
    )

    fun saveLastSearchedCity(cityName: String) {
        sharedPreferences.edit().putString(KEY_LAST_CITY, cityName).apply()
    }

    fun getLastSearchedCity(): String? {
        return sharedPreferences.getString(KEY_LAST_CITY, null)
    }

    companion object {
        private const val PREF_NAME = "weather_preferences"
        private const val KEY_LAST_CITY = "last_searched_city"
    }
} 