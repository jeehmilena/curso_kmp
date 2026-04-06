package br.com.cursokmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import br.com.cursokmp.navigation.Navigation
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    MaterialTheme {
        PreComposeApp {
            Navigation()
        }
    }
}