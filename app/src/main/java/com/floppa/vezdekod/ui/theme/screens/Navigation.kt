package com.floppa.vezdekod.ui.theme.screens

import android.view.Menu
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route) {
        composable(route = Screens.WelcomeScreen.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screens.MenuScreen.route) {
            MenuScreen(navController = navController)
        }
    }
}