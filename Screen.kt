package com.example.amadertangail.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object BloodBank : Screen("blood_bank")
    object EmergencyDirectory : Screen("emergency_directory")
    object HeritageTourism : Screen("heritage_tourism")
    object LocalNews : Screen("local_news")
}
