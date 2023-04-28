package com.example.examen2tyo.navigation

sealed class Screens(val route: String){

    object MainScreen: Screens("initial_screen")
    object Screen1: Screens("Pantalla 1")
    object Screen2: Screens("Pantalla 2")
}
