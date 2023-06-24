package com.example.moviesolera.presentation.ui

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.moviesolera.presentation.ui.model.MoviesState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    @ApplicationContext context: Context
) : ViewModel(){

    private val resources = context.resources

    private var _state = mutableStateOf(MoviesState())
    val state: State<MoviesState> = _state
}