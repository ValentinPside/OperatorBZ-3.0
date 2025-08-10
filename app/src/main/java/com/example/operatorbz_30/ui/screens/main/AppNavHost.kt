package com.example.operatorbz_30.ui.screens.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.operatorbz_30.ui.screens.HomeScreen
import com.example.operatorbz_30.ui.screens.LogsScreen
import com.example.operatorbz_30.ui.screens.StatsScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavDestination.HOME.route
    ) {
        composable(NavDestination.HOME.route) {
            HomeScreen()
        }
        composable(NavDestination.LOGS.route) {
            LogsScreen()
        }
        composable(NavDestination.STATS.route) {
            StatsScreen()
        }
    }
}