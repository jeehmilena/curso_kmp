package br.com.cursokmp.firstexample.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.DrawerState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Drawer(drawerState: DrawerState, navigator: Navigator, screenContent: @Composable () -> Unit) {
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    Text("Menu", modifier = Modifier.padding(16.dp))
                    HorizontalDivider()
                    NavigationDrawerItem(
                        label = { Text(text = "Home") },
                        icon = { Icon(Icons.Filled.Home, contentDescription = null) },
                        selected = false,
                        onClick = {
                            scope.launch {
                                navigator.navigate("/home")
                                drawerState.close()
                            }
                        }
                    )
                    NavigationDrawerItem(
                        label = { Text(text = "Detalhes") },
                        icon = { Icon(Icons.Filled.Details, contentDescription = null) },
                        selected = false,
                        onClick = {
                            scope.launch {
                                navigator.navigate("/detail")
                                drawerState.close()
                            }
                        }
                    )
                }
            }
        ) {
            screenContent()
        }
    }
}