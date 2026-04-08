package br.com.cursokmp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Profile(navigator: Navigator) {
    Column {
        Text(text = "Perfil", fontSize = 20.sp)
        Button(onClick = { navigator.goBack() }) { Text(text = "Voltar") }
    }
}