package br.com.cursokmp.secondexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.cursokmp.secondexample.navigation.AppRoutes.DETAILS
import br.com.cursokmp.secondexample.navigation.AppRoutes.HOME
import br.com.cursokmp.secondexample.screen.detail.DetailsScreen
import br.com.cursokmp.secondexample.screen.home.HomeScreen
import br.com.cursokmp.secondexample.screen.home.HomeViewModel

object AppRoutes {
    const val HOME = "home"
    const val DETAILS = "details"
}

@Composable
fun NavigationController() {
    val navController = rememberNavController()
    val homeViewModel = HomeViewModel()

    NavHost(navController = navController, startDestination = HOME) {
        composable(HOME) { HomeScreen(navController, homeViewModel) }
        composable(DETAILS) { DetailsScreen(navController, homeViewModel) }
    }
}