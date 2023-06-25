package com.example.moviesolera.presentation.ui.list

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.moviesolera.presentation.ui.model.MoviesState
import com.example.moviesolera.presentation.ui.theme.movieHeadboard
import com.example.moviesolera.R

@Composable
fun ListScreen(
    state: MoviesState = MoviesState()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        AnimatedVisibility(
            visibleState = MutableTransitionState(true),
            enter = expandHorizontally(),
            exit = shrinkHorizontally()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = stringResource(id = R.string.our_billboard),
                    style = movieHeadboard
                )
                LazyColumn {
                    items(items = state.listMovies){ movie ->
                        MoviesItem(
                            movie = movie,
                            onClick = {

                            }
                        )
                    }
                }
            }
        }
    }
}