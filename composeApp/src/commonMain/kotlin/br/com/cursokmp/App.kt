package br.com.cursokmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import br.com.cursokmp.secondexample.navigation.NavigationController
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    MaterialTheme {
        NavigationController()
    }
}