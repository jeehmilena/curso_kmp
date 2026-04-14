package br.com.cursokmp.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun TabRowNavigation(navigator: Navigator) {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Tab 1", "Tab 2", "Tab com titulo grande")

    Column {
        TabRow(selectedTabIndex = state) {
            titles.forEachIndexed { index, title ->
                Tab(
                    selected = state == index,
                    onClick = { state = index },
                    text = { Text(text = title, maxLines = 2, overflow = TextOverflow.Ellipsis) },
                    icon = {
                        if (index == 0) Icon(Icons.Filled.FavoriteBorder, contentDescription = title)
                        if (index == 1) Icon(Icons.Filled.Star, contentDescription = title)
                        if (index == 2) Icon(Icons.Filled.Hotel, contentDescription = title)
                    }
                )
            }
        }
        if (state == 0) {
            Text(text = "Deseja voltar de tela?", fontSize = 20.sp)
            Button(onClick = { navigator.goBack() }) { Text(text = "Voltar") }
        }
        if (state == 1) {
            Text(text = "Conteúdo novo", fontSize = 20.sp)
        }
        if (state == 2) {
            Button(onClick = { navigator.goBack() }) { Text(text = "Voltar") }
        }


    }
}