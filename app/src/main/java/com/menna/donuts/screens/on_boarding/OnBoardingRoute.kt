package com.menna.donuts.screens.on_boarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.menna.donuts.Screens

private val ROUTE = Screens.OnBoarding.route
fun NavGraphBuilder.onBoardingRoute() {
    composable(ROUTE) { OnBoardingScreen() }
}