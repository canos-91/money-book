package org.canos.moneybook.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val label: String, val icon: ImageVector) {
    object Home : Screen(route = "home_screen", label = "Home", icon = Icons.Filled.Home)
    object Stats : Screen(route = "stats_screen", label = "Stats", icon = Icons.Filled.Home)
}