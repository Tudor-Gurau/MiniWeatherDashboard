package com.example.miniweatherdashboard.di

import android.content.Context
import com.example.miniweatherdashboard.data.api.WeatherApiService
import com.example.miniweatherdashboard.data.local.WeatherPreferences
import com.example.miniweatherdashboard.data.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideWeatherApiService(): WeatherApiService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.weatherapi.com/v1/")
            .build()
            .create(WeatherApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideWeatherRepository(
        apiService: WeatherApiService,
        @ApplicationContext context: Context
    ): WeatherRepository {
        return WeatherRepository(apiService, context)
    }

    @Provides
    @Singleton
    fun provideWeatherPreferences(
        @ApplicationContext context: Context
    ): WeatherPreferences {
        return WeatherPreferences(context)
    }
} 