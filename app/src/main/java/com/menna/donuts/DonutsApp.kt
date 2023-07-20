package com.menna.donuts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController

@Composable
fun DonutsApp() {
    CompositionLocalProvider(
        LocalNavigationProvider provides rememberNavController()
    ) {
        DonutsNavGraph()
    }
}