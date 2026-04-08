package br.com.cursokmp.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import br.com.cursokmp.screens.Detail
import br.com.cursokmp.screens.Memories
import br.com.cursokmp.screens.Profile
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun TabBarNavigation(navigator: Navigator) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Detalhe", "Memórias", "Perfil")

    if (selectedItem == 0) Detail(navigator)
    if (selectedItem == 1) Memories(navigator)
    if (selectedItem == 2) Profile(navigator)

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {
        NavigationBar {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    icon = {
                        if (index == 0) Icon(Icons.Filled.Details, contentDescription = item)
                        if (index == 1) Icon(Icons.Filled.Memory, contentDescription = item)
                        if (index == 2) Icon(Icons.Default.VerifiedUser, contentDescription = item)
                    },
                    label = { Text(item) },
                    selected = selectedItem == index,
                    onClick = { selectedItem = index }
                )
            }
        }
    }
}

