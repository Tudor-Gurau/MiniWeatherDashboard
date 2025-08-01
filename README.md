# Weather Dashboard

A simple weather application built with Android Jetpack Compose that allows users to search for a city and view its current weather conditions using the WeatherAPI.

## Features

- **Search by City**: Enter any city name to get current weather information
- **Weather Display**: Shows temperature, weather condition, feels like temperature, humidity, and wind speed
- **Loading States**: Displays a loading spinner while fetching weather data
- **Error Handling**: Shows appropriate error messages for invalid cities or network issues
- **Data Persistence**: Remembers the last searched city using SharedPreferences
- **Modern UI**: Built with Material Design 3 and Jetpack Compose

## Architecture

The app follows Clean Architecture principles with the following layers:

- **Data Layer**: API service, repository, and local preferences
- **Domain Layer**: UI state models and business logic
- **Presentation Layer**: ViewModel, UI components, and screens

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM with Clean Architecture
- **Dependency Injection**: Hilt
- **Networking**: Retrofit
- **Async Programming**: Coroutines and StateFlow
- **Testing**: JUnit for unit tests

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Replace `YOUR_API_KEY_HERE` in `secrets.xml` with your WeatherAPI key
4. Build and run the app

## API Key

To use this app, you need to get a free API key from [WeatherAPI](https://www.weatherapi.com/). Replace the placeholder in the `secrets.xml` file:

```xml
<string name="weather_api_key">YOUR_ACTUAL_API_KEY_HERE</string>
```

## Project Structure

```
app/src/main/java/com/example/miniweatherdashboard/
├── data/
│   ├── api/WeatherApiService.kt
│   ├── local/WeatherPreferences.kt
│   ├── model/WeatherResponse.kt
│   └── repository/WeatherRepository.kt
├── di/AppModule.kt
├── domain/model/WeatherUiState.kt
├── presentation/
│   ├── ui/
│   │   ├── components/
│   │   │   ├── ErrorDisplay.kt
│   │   │   ├── LoadingSpinner.kt
│   │   │   ├── SearchBar.kt
│   │   │   └── WeatherCard.kt
│   │   └── screen/WeatherScreen.kt
│   └── viewmodel/WeatherViewModel.kt
├── MainActivity.kt
└── WeatherApplication.kt
```

## Testing

The app includes unit tests for the ViewModel to ensure proper error handling and state management. Run the tests using:

```bash
./gradlew test
```

## Future Enhancements

- Add weather icons using WeatherAPI icon URLs
- Implement location-based weather
- Add weather forecasts
- Implement offline caching
- Add more weather details (pressure, UV index, etc.) 