package com.example.simplenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplenavigation.ui.screens.ScreenA
import com.example.simplenavigation.ui.screens.ScreenB

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screenA") {
        composable("screenA") { ScreenA(navController)}
        composable("screenB") { ScreenB()}

    }
}