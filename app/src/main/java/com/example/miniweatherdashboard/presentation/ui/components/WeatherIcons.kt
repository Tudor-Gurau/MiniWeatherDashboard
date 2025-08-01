package com.example.miniweatherdashboard.presentation.ui.components

import com.tudor.weatherappcompose.R

object WeatherIcons {
    
    fun getWeatherIcon(condition: String): Int {
        return when {
            condition.contains("sunny", ignoreCase = true) -> R.drawable.clear_day
            condition.contains("clear", ignoreCase = true) -> R.drawable.clear_day
            condition.contains("cloudy", ignoreCase = true) -> R.drawable.cloudy
            condition.contains("overcast", ignoreCase = true) -> R.drawable.cloudy
            condition.contains("partly cloudy", ignoreCase = true) -> R.drawable.partly_cloudy_day
            condition.contains("mostly cloudy", ignoreCase = true) -> R.drawable.mostly_cloudy_day
            condition.contains("mostly clear", ignoreCase = true) -> R.drawable.mostly_clear_day
            condition.contains("cloud", ignoreCase = true) -> R.drawable.cloudy
            condition.contains("rain", ignoreCase = true) -> R.drawable.rain_with_cloudy_light
            condition.contains("drizzle", ignoreCase = true) -> R.drawable.drizzle
            condition.contains("shower", ignoreCase = true) -> R.drawable.scattered_showers_day
            condition.contains("snow", ignoreCase = true) -> R.drawable.snow_with_cloudy_light
            condition.contains("sleet", ignoreCase = true) -> R.drawable.sleet_hail
            condition.contains("hail", ignoreCase = true) -> R.drawable.sleet_hail
            condition.contains("thunder", ignoreCase = true) -> R.drawable.isolated_thunderstorms
            condition.contains("storm", ignoreCase = true) -> R.drawable.strong_thunderstorms
            condition.contains("lightning", ignoreCase = true) -> R.drawable.isolated_thunderstorms
            condition.contains("fog", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("mist", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("haze", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("smoke", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("dust", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("sand", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("ash", ignoreCase = true) -> R.drawable.haze_fog_dust_smoke
            condition.contains("tornado", ignoreCase = true) -> R.drawable.tornado
            condition.contains("hurricane", ignoreCase = true) -> R.drawable.tropical_storm_hurricane
            condition.contains("typhoon", ignoreCase = true) -> R.drawable.tropical_storm_hurricane
            condition.contains("cyclone", ignoreCase = true) -> R.drawable.tropical_storm_hurricane
            condition.contains("tropical storm", ignoreCase = true) -> R.drawable.tropical_storm_hurricane
            condition.contains("wind", ignoreCase = true) -> R.drawable.windy
            condition.contains("breeze", ignoreCase = true) -> R.drawable.windy
            condition.contains("gale", ignoreCase = true) -> R.drawable.windy
            condition.contains("blizzard", ignoreCase = true) -> R.drawable.blizzard
            condition.contains("blowing", ignoreCase = true) -> R.drawable.blowing_snow
            condition.contains("freezing", ignoreCase = true) -> R.drawable.very_cold
            condition.contains("ice", ignoreCase = true) -> R.drawable.icy
            condition.contains("frost", ignoreCase = true) -> R.drawable.very_cold
            condition.contains("very cold", ignoreCase = true) -> R.drawable.very_cold
            condition.contains("very hot", ignoreCase = true) -> R.drawable.very_hot
            condition.contains("mixed rain", ignoreCase = true) -> R.drawable.mixed_rain_snow
            condition.contains("mixed snow", ignoreCase = true) -> R.drawable.mixed_rain_snow
            condition.contains("flurries", ignoreCase = true) -> R.drawable.flurries
            condition.contains("heavy rain", ignoreCase = true) -> R.drawable.heavy_rain
            condition.contains("heavy snow", ignoreCase = true) -> R.drawable.heavy_snow
            condition.contains("isolated", ignoreCase = true) -> R.drawable.isolated_thunderstorms
            condition.contains("scattered", ignoreCase = true) -> R.drawable.scattered_showers_day
            else -> R.drawable.clear_day // Default icon
        }
    }
} 