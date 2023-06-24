package com.example.moviesolera.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.moviesolera.presentation.ui.favorite.FavoriteScreen
import com.example.moviesolera.presentation.ui.list.ListScreen
import com.example.moviesolera.presentation.ui.model.MoviesState

fun NavGraphBuilder.moviesGraph(
    state: () ->MoviesState
){
    navigation(
        startDestination = MoviesNavigation.MoviesList.route,
        route = MoviesNavigation.MoviesList.route
    ) {
        composable(route = MoviesNavigation.MoviesList.route) {
            ListScreen()
        }
        composable(route = MoviesNavigation.MoviesFavorite.route) {
            FavoriteScreen()
        }
    }
}