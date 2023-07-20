package com.menna.donuts.screens.home

import androidx.compose.ui.graphics.Color
import com.menna.donuts.R

data class HomeUiState(
   val DonutsImages: List<Int> = listOf(
       R.drawable.chocolate_cherry,
       R.drawable.strawberry_rain,
       R.drawable.strawberry
   ),
   val DonutsTitles: List<String> = listOf("Chocolate Cherry","Strawberry Rain","Strawberry"),
   val DonutsPrices: List<String> = listOf("$20", "$24", "$22"),

   val CardColor: List<Color> = listOf(Color(0xFFD7E4F6) , Color(0xFFFFC7D0)),
   val OffersImages: List<Int> = listOf(
       R.drawable.strawberry_wheel,R.drawable.chocolate_glaze
   ),
   val OfferTitles: List<String> = listOf("Strawberry Wheel","Chocolate Glaze"),
   val DonutDetails: List<String> = listOf(
       "These Baked Strawberry Donuts are filled with fresh strawberries...",
       "Moist and fluffy baked chocolate donuts full of chocolate flavor."
   ),
   val OfferLastPrice: List<String> = listOf("$16", "$18"),
   val OfferPrice: List<String> = listOf("$20","$22")
)
