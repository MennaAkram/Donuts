package com.menna.donuts

sealed class Screens(val route: String) {
    object Home : Screens("home")
    object OnBoarding : Screens("on_boarding")
    object Details : Screens("details")
}