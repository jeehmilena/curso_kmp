package br.com.cursokmp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import br.com.cursokmp.navigation.TabRowNavigation
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Detail(navigator: Navigator) {
    Column {
        TabRowNavigation(navigator)
    }
}