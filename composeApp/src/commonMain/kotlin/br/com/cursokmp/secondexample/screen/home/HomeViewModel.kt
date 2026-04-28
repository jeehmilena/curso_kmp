package br.com.cursokmp.secondexample.screen.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    var booleanState by mutableStateOf(false)

    fun toggleBooleanState() {
        booleanState = !booleanState
    }
}