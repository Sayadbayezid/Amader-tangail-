package com.example.amadertangail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.amadertangail.navigation.Screen
import com.example.amadertangail.ui.screens.*
import com.example.amadertangail.ui.theme.AmaderTangailTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmaderTangailTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(onNavigate = { route ->
                navController.navigate(route)
            })
        }
        composable(Screen.BloodBank.route) {
            BloodBankScreen()
        }
        composable(Screen.EmergencyDirectory.route) {
            EmergencyDirectoryScreen()
        }
        composable(Screen.HeritageTourism.route) {
            HeritageTourismScreen()
        }
        composable(Screen.LocalNews.route) {
            LocalNewsScreen()
        }
    }
}
