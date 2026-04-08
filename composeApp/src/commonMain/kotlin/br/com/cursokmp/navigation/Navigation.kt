package br.com.cursokmp.navigation

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import br.com.cursokmp.screens.Detail
import br.com.cursokmp.screens.Home
import br.com.cursokmp.screens.Memories
import br.com.cursokmp.screens.Profile
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition

@Composable
fun Navigation() {
    val navigator = rememberNavigator()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = "/home",
    ) {
        scene(
            route = "/home",
            navTransition = NavTransition(),
        ) {
            Home(navigator, drawerState)
        }

        scene(
            route = "/detail",
            navTransition = NavTransition(),
        ) {
            Detail(navigator)
        }

        scene(
            route = "/profile",
            navTransition = NavTransition(),
        ) {
            Profile(navigator)
        }

        scene(
            route = "/memories",
            navTransition = NavTransition(),
        ) {
            Memories(navigator)
        }


    }
}