package com.menna.donuts.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.menna.donuts.ui.theme.Black60
import com.menna.donuts.ui.theme.Primary
import com.menna.donuts.ui.theme.Typography
import com.menna.donuts.ui.theme.White

@Composable
fun DonutsCard(
    painter: Painter,
    title: String,
    price: String,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Center,
        modifier = modifier.padding(top = 8.dp, start = 16.dp)
    ) {
        Box(
            modifier = modifier
                .size(width = 130.dp, height = 120.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(White)
        )
            Column(
                horizontalAlignment = CenterHorizontally,
                modifier = Modifier.padding(bottom = 56.dp)
            ) {
                Image(
                    painter = painter,
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(100.dp)
                )
                Text(
                    text = title,
                    style = Typography.titleSmall,
                    color = Black60
                )
                Text(
                    text = price,
                    style = Typography.bodyLarge,
                    color = Primary
                )
            }
    }
}