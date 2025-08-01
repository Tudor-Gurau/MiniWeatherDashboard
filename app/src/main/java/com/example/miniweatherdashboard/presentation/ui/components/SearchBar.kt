package com.example.miniweatherdashboard.presentation.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(
    onSearch: (String) -> Unit,
    lastSearchedCity: String? = null,
    modifier: Modifier = Modifier
) {
    var cityName by remember { mutableStateOf(lastSearchedCity ?: "") }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = cityName,
            onValueChange = { cityName = it },
            label = { Text("Enter city name") },
            placeholder = { 
                lastSearchedCity?.let { 
                    Text("Last searched: $it") 
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            singleLine = true
        )
        
        Button(
            onClick = { 
                if (cityName.isNotBlank()) {
                    onSearch(cityName)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            enabled = cityName.isNotBlank()
        ) {
            Text("Search Weather")
        }
    }
} 