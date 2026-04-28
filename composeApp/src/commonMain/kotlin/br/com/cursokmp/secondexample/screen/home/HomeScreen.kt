package br.com.cursokmp.secondexample.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.cursokmp.secondexample.components.ButtonComponent
import br.com.cursokmp.secondexample.components.ButtonText
import br.com.cursokmp.secondexample.navigation.AppRoutes.DETAILS
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import io.ktor.http.Url

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
        ButtonComponent(text = ButtonText.SaibaMais, onClick = { handleHome() }, Color.Magenta)

        KamelImage(
            modifier = Modifier.fillMaxSize(1f).padding(start = 8.dp),
            contentScale = ContentScale.Fit,
            resource = asyncPainterResource(Url("https://akamai.sscdn.co/uploadfile/letras/fotos/4/4/e/6/44e680875894c521cc42a235e236867f.jpg")),
            contentDescription = "Android Logo"
        )
    }
}