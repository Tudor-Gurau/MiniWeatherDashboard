# Mini Weather Dashboard

A modern weather application built with Android Jetpack Compose that provides current weather information with beautiful custom icons and smart recommendations using the WeatherAPI.

## Features

- **Search by City**: Enter any city name to get current weather information
- **Custom Weather Icons**: Beautiful custom XML drawable icons for different weather conditions
- **Dynamic Background Colors**: Weather-responsive card backgrounds with modern, friendly colors
- **Smart Weather Recommendations**: Contextual suggestions based on weather conditions and temperature
- **Weather Display**: Shows temperature, weather condition, feels like temperature, humidity, and wind speed
- **Loading States**: Displays a loading spinner while fetching weather data
- **Error Handling**: Shows appropriate error messages for invalid cities or network issues
- **Data Persistence**: Remembers the last searched city and weather data using SharedPreferences
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
- **Networking**: Retrofit with Gson serialization
- **Async Programming**: Coroutines and StateFlow
- **Testing**: JUnit for unit tests
- **Build System**: Gradle Kotlin DSL

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
│   ├── api/
│   │   └── WeatherApiService.kt          # Retrofit API service for weather data
│   ├── local/
│   │   └── WeatherPreferences.kt         # SharedPreferences for data persistence
│   ├── model/
│   │   ├── Condition.kt                  # Weather condition data model
│   │   ├── Current.kt                    # Current weather data model
│   │   ├── Location.kt                   # Location data model
│   │   └── WeatherResponse.kt            # Main API response model
│   └── repository/
│       └── WeatherRepository.kt          # Repository for weather data operations
├── di/
│   └── AppModule.kt                      # Hilt dependency injection module
├── domain/
│   └── model/
│       ├── WeatherInfo.kt                # Domain model for weather information
│       └── WeatherUiState.kt             # UI state model
├── presentation/
│   ├── ui/
│   │   ├── components/
│   │   │   ├── ErrorDisplay.kt           # Error display component
│   │   │   ├── LoadingSpinner.kt         # Loading spinner component
│   │   │   ├── SearchBar.kt              # Search input component
│   │   │   ├── WeatherCard.kt            # Weather information card with dynamic backgrounds
│   │   │   ├── WeatherIcons.kt           # Custom weather icon mapping utility
│   │   │   └── WeatherUtils.kt           # Weather recommendations and background colors
│   │   ├── model/
│   │   │   └── WeatherUiState.kt         # Presentation UI state model
│   │   └── screen/
│   │       └── WeatherScreen.kt          # Main weather screen
│   └── viewmodel/
│       └── WeatherViewModel.kt           # ViewModel for weather logic
├── ui/
│   └── theme/
│       ├── Color.kt                      # App color definitions
│       ├── Theme.kt                      # App theme configuration
│       └── Type.kt                       # Typography definitions
├── MainActivity.kt                       # Main activity entry point
└── WeatherApplication.kt                 # Application class with Hilt
```

## Custom Weather Icons

The app includes a comprehensive set of custom XML drawable icons for different weather conditions:
- **Clear/Sunny**: `clear_day`, `clear_night`
- **Cloudy**: `cloudy`, `partly_cloudy_day`, `mostly_cloudy_day`
- **Rain**: `rain_with_cloudy_light`, `drizzle`, `scattered_showers_day`
- **Snow**: `snow_with_cloudy_light`, `heavy_snow`, `flurries`
- **Storm**: `isolated_thunderstorms`, `strong_thunderstorms`
- **Special Conditions**: `tornado`, `tropical_storm_hurricane`, `windy`, `blizzard`

## Weather Recommendations

The app provides contextual recommendations based on weather conditions:
- **Perfect Weather**: "Perfect day for a walk! 🌟" (sunny, 15-25°C)
- **Rainy Weather**: "Don't forget your umbrella! ☔"
- **Hot Weather**: "Stay hydrated and cool! 🥤" (>30°C)
- **Cold Weather**: "Bundle up, it's freezing! ❄️" (<0°C)
- **Stormy Weather**: "Stay indoors and stay safe! ⚡"

## Dynamic Background Colors

Weather-responsive card backgrounds with modern, friendly colors:
- **Sunny**: Warm orange tint for hot days, light blue for comfortable days
- **Rainy**: Cool blue tones
- **Snowy**: Ice blue
- **Stormy**: Soft purple
- **Cloudy**: Soft gray
- **Windy**: Soft green

## Testing

The app includes unit tests for the ViewModel to ensure proper error handling and state management. Run the tests using:

```bash
./gradlew test
```

## Key Features Implementation

### Error Handling
- **Invalid City Detection**: Handles HTTP 400 errors for non-existent cities
- **Network Error Handling**: Graceful fallback for network issues
- **User-Friendly Messages**: Clear error messages displayed in the UI

### Data Persistence
- **Last City Memory**: Remembers the last searched city
- **Weather Data Loading**: Loads and displays the last retrieved weather on app startup
- **SharedPreferences Integration**: Efficient local storage using Android's SharedPreferences

### UI/UX Features
- **Responsive Design**: Adapts to different screen sizes
- **Material Design 3**: Modern design language with dynamic colors
- **Loading States**: Smooth loading animations
- **Accessibility**: Proper content descriptions and semantic structure

## Future Enhancements

- Add weather forecasts for upcoming days
- Implement location-based weather using GPS
- Add weather animations and transitions
- Implement offline caching with Room database
- Add more weather details (pressure, UV index, visibility)
- Add weather alerts and notifications
- Implement weather widgets 