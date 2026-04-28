package br.com.cursokmp.secondexample.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

sealed class ButtonText(val value: String) {
    object Ir : ButtonText("Ir")
    object SaibaMais : ButtonText("Saiba Mais")
}

@Composable
fun ButtonComponent(text: ButtonText, onClick: () -> Unit, color: Color = Color.Green) {
    Button(
        colors = ButtonDefaults.buttonColors(color),
        onClick = { onClick() },
    ) {
        Text(text.value)
    }
}