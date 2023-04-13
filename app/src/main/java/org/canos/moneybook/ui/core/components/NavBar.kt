package org.canos.moneybook.ui.core.components

import android.graphics.Color
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import org.canos.moneybook.ui.screens.Screen

@Composable
fun NavBar(navController: NavHostController) {
    val screensList = arrayListOf<Screen>()
    screensList.add(Screen.Home)
    screensList.add(Screen.Stats)

//    val contextForToast = LocalContext.current.applicationContext

    BottomAppBar(
        cutoutShape = CircleShape
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        screensList.forEachIndexed { index, menuItem ->
            if (index == 1) {
                // add an empty space for FAB
                BottomNavigationItem(selected = false, onClick = {}, icon = {}, enabled = false
                )
            }

            BottomNavigationItem(onClick = {
                navController.navigate(menuItem.route) {

                    navController.graph.startDestinationRoute?.let { route ->
                        popUpTo(route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }, icon = {
                Icon(
                    imageVector = menuItem.icon, contentDescription = menuItem.label

                )

            }, label = {
                Text(
                    text = menuItem.label, fontSize = 9.sp
                )
            },
//                selectedContentColor = Color.Black,
//                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true, selected = currentRoute == menuItem.route, enabled = true
            )
        }
    }
}