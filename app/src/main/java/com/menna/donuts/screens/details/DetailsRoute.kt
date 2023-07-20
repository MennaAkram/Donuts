package com.menna.donuts.screens.details

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.menna.donuts.Screens

private val ROUTE = Screens.Details.route
fun NavController.navigateToDetails() {
    navigate(ROUTE)
}

fun NavGraphBuilder.detailsRoute() {
    composable(ROUTE) { DetailsScreen() }
}