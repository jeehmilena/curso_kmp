package br.com.cursokmp.firstexample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import br.com.cursokmp.firstexample.navigation.TabRowNavigation
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Detail(navigator: Navigator) {
    Column {
        TabRowNavigation(navigator)
    }
}