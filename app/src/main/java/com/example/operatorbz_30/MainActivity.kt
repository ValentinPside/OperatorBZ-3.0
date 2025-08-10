package com.example.operatorbz_30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import com.example.operatorbz_30.ui.screens.main.MainApp
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.example.operatorbz_30.ui.theme.OperatorBZ30Theme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OperatorBZ30Theme {
                val windowSizeClass = calculateWindowSizeClass(this)
                MainApp(windowSizeClass.widthSizeClass)
            }
        }
    }
}