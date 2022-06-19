package com.floppa.vezdekod.ui.theme.screens

sealed class Screens(val route: String) {
    object WelcomeScreen: Screens("welcome_screen")
    object MenuScreen: Screens("menu_screen")
}
