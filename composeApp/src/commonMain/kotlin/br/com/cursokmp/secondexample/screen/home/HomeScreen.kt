package br.com.cursokmp.secondexample.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import br.com.cursokmp.secondexample.components.ButtonComponent
import br.com.cursokmp.secondexample.components.ButtonText
import br.com.cursokmp.secondexample.navigation.AppRoutes.DETAILS

@Composable
fun HomeScreen(navController: NavController, homeViewModel: HomeViewModel) {
    fun handleHome() {
        navController.navigate(DETAILS)
        homeViewModel.toggleBooleanState()
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Bem-vindo à tela Home!")
        Button(onClick = { handleHome() }) {
            Text("Navegar para detalhes")
        }
        Text(if (homeViewModel.booleanState) "Estado é verdadeiro" else "Estado é falso")
        ButtonComponent(text = ButtonText.SaibaMais, onClick = { handleHome()}, Color.Magenta)
    }
}