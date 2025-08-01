package com.example.miniweatherdashboard.presentation.ui.components

import androidx.compose.ui.graphics.Color

object WeatherUtils {
    
    fun getWeatherRecommendation(condition: String, temperature: Double): String {
        return when {
            condition.contains("sunny", ignoreCase = true) && temperature in 15.0..25.0 -> 
                "Perfect day for a walk!"
            condition.contains("sunny", ignoreCase = true) && temperature in 25.0..35.0 ->
                "Great day for outdoor activities!"
            condition.contains("sunny", ignoreCase = true) && temperature > 35.0 ->
                "Look for some shade and stay cool!"
            condition.contains("sunny", ignoreCase = true) && temperature < 15.0 -> 
                "Beautiful day, but dress warmly!"
            condition.contains("clear", ignoreCase = true) -> 
                "Clear skies ahead!"
            condition.contains("cloudy", ignoreCase = true) && temperature in 15.0..25.0 -> 
                "Nice weather for a stroll!"
            condition.contains("rain", ignoreCase = true) -> 
                "Don't forget your umbrella!"
            condition.contains("drizzle", ignoreCase = true) -> 
                "Light rain, bring a jacket!"
            condition.contains("snow", ignoreCase = true) -> 
                "Winter wonderland! Build a snowman!"
            condition.contains("thunder", ignoreCase = true) || condition.contains("storm", ignoreCase = true) -> 
                "Stay indoors and stay safe!"
            condition.contains("fog", ignoreCase = true) || condition.contains("mist", ignoreCase = true) -> 
                "Drive carefully in low visibility!"
            condition.contains("wind", ignoreCase = true) && temperature < 10.0 -> 
                "Bundle up, it's windy and cold!"
            condition.contains("wind", ignoreCase = true) -> 
                "Hold onto your hat!"
            temperature > 30.0 -> 
                "Stay hydrated and cool!"
            temperature < 0.0 -> 
                "Bundle up, it's freezing!️"
            else -> 
                "Enjoy your day!"
        }
    }
    
    fun getWeatherBackgroundColor(condition: String, temperature: Double): Color {
        return when {
            condition.contains("sunny", ignoreCase = true) && temperature > 25.0 -> 
                Color(0xFFFFF3E0) // Warm orange tint
            condition.contains("sunny", ignoreCase = true) || condition.contains("clear", ignoreCase = true) -> 
                Color(0xFFE3F2FD) // Light blue sky
            condition.contains("cloudy", ignoreCase = true) || condition.contains("overcast", ignoreCase = true) -> 
                Color(0xFFF5F5F5) // Soft gray
            condition.contains("rain", ignoreCase = true) || condition.contains("drizzle", ignoreCase = true) -> 
                Color(0xFFE8F4FD) // Cool blue rain
            condition.contains("snow", ignoreCase = true) || condition.contains("sleet", ignoreCase = true) -> 
                Color(0xFFF0F8FF) // Ice blue
            condition.contains("thunder", ignoreCase = true) || condition.contains("storm", ignoreCase = true) -> 
                Color(0xFFF3E5F5) // Soft purple storm
            condition.contains("fog", ignoreCase = true) || condition.contains("mist", ignoreCase = true) -> 
                Color(0xFFFAFAFA) // Very light gray
            condition.contains("wind", ignoreCase = true) -> 
                Color(0xFFE8F5E8) // Soft green wind
            temperature > 30.0 -> 
                Color(0xFFFFF0F0) // Warm red tint
            temperature < 0.0 -> 
                Color(0xFFF0F8FF) // Cool blue
            else -> 
                Color(0xFFFAFAFA) // Default light gray
        }
    }
    
    fun getRecommendationIcon(condition: String, temperature: Double): String {
        return when {
            condition.contains("sunny", ignoreCase = true) && temperature in 15.0..25.0 -> "🌟"
            condition.contains("sunny", ignoreCase = true) && temperature > 25.0 -> "☀️"
            condition.contains("sunny", ignoreCase = true) && temperature < 15.0 -> "🧥"
            condition.contains("clear", ignoreCase = true) -> "✨"
            condition.contains("cloudy", ignoreCase = true) && temperature in 15.0..25.0 -> "☁️"
            condition.contains("rain", ignoreCase = true) -> "☔"
            condition.contains("drizzle", ignoreCase = true) -> "🌧️"
            condition.contains("snow", ignoreCase = true) -> "⛄"
            condition.contains("thunder", ignoreCase = true) || condition.contains("storm", ignoreCase = true) -> "⚡"
            condition.contains("fog", ignoreCase = true) || condition.contains("mist", ignoreCase = true) -> "🌫️"
            condition.contains("wind", ignoreCase = true) && temperature < 10.0 -> "💨"
            condition.contains("wind", ignoreCase = true) -> "💨"
            temperature > 30.0 -> "🥤"
            temperature < 0.0 -> "❄️"
            else -> "🌤️"
        }
    }
} 