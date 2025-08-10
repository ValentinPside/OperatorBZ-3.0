package com.example.operatorbz_30.ui.screens.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.List
import androidx.compose.ui.graphics.vector.ImageVector

enum class NavDestination(
    val route: String,
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    HOME("home", "Главная", Icons.Filled.Home, Icons.Outlined.Home),
    LOGS("logs", "Журнал", Icons.Filled.List, Icons.Outlined.List),
    STATS("stats", "Статистика", Icons.Filled.Info, Icons.Outlined.Info);

    companion object {
        val all = entries
    }
}