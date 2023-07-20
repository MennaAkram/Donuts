package com.menna.donuts.screens.on_boarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.donuts.LocalNavigationProvider
import com.menna.donuts.R
import com.menna.donuts.composable.ButtonItem
import com.menna.donuts.composable.TextItem
import com.menna.donuts.screens.home.navigateToHome
import com.menna.donuts.ui.theme.Black
import com.menna.donuts.ui.theme.Pink60
import com.menna.donuts.ui.theme.Pink80
import com.menna.donuts.ui.theme.Primary
import com.menna.donuts.ui.theme.Typography
import com.menna.donuts.ui.theme.White

@Composable
fun OnBoardingScreen() {
    val navController = LocalNavigationProvider.current
    OnBoardingContent(
        onClick = {navController.navigateToHome()}
    )
}

@Composable
fun OnBoardingContent(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .fillMaxSize()
            .background(Pink60)
            .paint(
                painter = painterResource(R.drawable.onboarding_background),
                contentScale = ContentScale.FillWidth, alignment = Alignment.TopCenter
            )
            .padding(horizontal = 24.dp)
    ) {
        TextItem(text = "Gonuts\n" + "with\n" + "Donuts", textColor = Primary,
            textStyle = Typography.displayLarge, modifier = Modifier.padding(bottom = 24.dp))
        TextItem(
            text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
            textColor = Pink80,
            textStyle = Typography.titleLarge
        )
        ButtonItem(text = "Get Started", textColor = Black, onClick = onClick,
            buttonColor = White, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 24.dp, start = 16.dp, end = 16.dp),)
    }
}