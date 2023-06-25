package com.example.moviesolera.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.moviesolera.presentation.ui.home.HomeScreen
import com.example.moviesolera.presentation.ui.theme.MovieSoleraTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val moviesViewModel by viewModels<MoviesViewModel>()
        setContent {
            MovieSoleraTheme {
                HomeScreen(moviesViewModel)
            }
        }
    }
}