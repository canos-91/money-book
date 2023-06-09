package org.canos.moneybook.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.canos.moneybook.ui.screens.HomeScreen
import org.canos.moneybook.ui.screens.Screen
import org.canos.moneybook.ui.screens.StatsScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Stats.route) {
            StatsScreen(navController = navController)
        }
    }
}