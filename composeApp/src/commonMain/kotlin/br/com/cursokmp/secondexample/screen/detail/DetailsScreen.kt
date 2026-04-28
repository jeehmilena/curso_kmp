package br.com.cursokmp.secondexample.screen.detail

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
import br.com.cursokmp.secondexample.screen.home.HomeViewModel

@Composable
fun DetailsScreen(navController: NavController, homeViewModel: HomeViewModel) {
    fun handleBack() {
        navController.popBackStack()
        homeViewModel.toggleBooleanState()
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Bem-vindo à tela de detalhes!")
        Button(onClick = { handleBack() }) {
            Text("Voltar para Home")
        }
        Text(if (homeViewModel.booleanState) "Estado é verdadeiro" else "Estado é falso")
        ButtonComponent(text = ButtonText.Ir, onClick = { handleBack()})
    }
}