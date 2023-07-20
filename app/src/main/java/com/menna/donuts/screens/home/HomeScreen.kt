package com.menna.donuts.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.donuts.composable.TextItem
import com.menna.donuts.screens.home.composable.BottomNavigation
import com.menna.donuts.screens.home.composable.DonutsCard
import com.menna.donuts.screens.home.composable.Header
import com.menna.donuts.screens.home.composable.TodayOfferCard
import com.menna.donuts.ui.theme.Background
import com.menna.donuts.ui.theme.Black
import com.menna.donuts.ui.theme.Typography

@Composable
fun HomeScreen() {

    HomeContent()
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    state: HomeUiState = HomeUiState(),
) {
    Column (
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .background(Background)
            .padding(top = 16.dp)
            ){
        Header()
        TextItem(text = "Today Offers", textColor = Black, textStyle = Typography.labelLarge)
        LazyRow(
            verticalAlignment = Alignment.Bottom,
        ){
            items(2){
                TodayOfferCard(
                    CardColor = state.CardColor[it],
                    painter = painterResource(state.OffersImages[it]),
                    offerTitle = state.OfferTitles[it],
                    offerDetails = state.DonutDetails[it],
                    offerLastPrice = state.OfferLastPrice[it],
                    offerPrice = state.OfferPrice[it],
                )
            }
        }
        TextItem(text = "Donuts", textColor = Black, textStyle = Typography.labelLarge)
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.Bottom
        ){
            items(3){
                DonutsCard(painter = painterResource(state.DonutsImages[it]),
                    title = state.DonutsTitles[it], price = state.DonutsPrices[it])
            }
        }
        BottomNavigation()
    }
}