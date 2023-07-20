package com.menna.donuts

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.menna.donuts.screens.details.detailsRoute
import com.menna.donuts.screens.home.homeRoute
import com.menna.donuts.screens.on_boarding.onBoardingRoute

@Composable
fun DonutsNavGraph() {
    val navController = LocalNavigationProvider.current

    NavHost(navController = navController,
        startDestination = Screens.OnBoarding.route){
        homeRoute()
        onBoardingRoute()
        detailsRoute()
    }
}



