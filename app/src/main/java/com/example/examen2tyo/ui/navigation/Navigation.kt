package com.example.examen2tyo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examen2tyo.ui.screens.MainScreen
import com.example.examen2tyo.ui.screens.EJ1.Screen1
import com.example.examen2tyo.ui.screens.Screen2

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Screen1.route) { Screen1() }
        composable(route = Screens.Screen2.route) { Screen2() }
    }
}


