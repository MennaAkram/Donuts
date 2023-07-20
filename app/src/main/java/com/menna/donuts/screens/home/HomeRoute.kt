package com.menna.donuts.screens.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.menna.donuts.Screens

private val ROUTE = Screens.Home.route
fun NavController.navigateToHome() {
    navigate(ROUTE)
}

fun NavGraphBuilder.homeRoute() {
    composable(ROUTE) { HomeScreen() }
}