package com.menna.donuts.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.menna.donuts.LocalNavigationProvider
import com.menna.donuts.R
import com.menna.donuts.screens.details.navigateToDetails
import com.menna.donuts.ui.theme.Black
import com.menna.donuts.ui.theme.Black60
import com.menna.donuts.ui.theme.Primary
import com.menna.donuts.ui.theme.Typography
import com.menna.donuts.ui.theme.White

@Composable
fun TodayOfferCard(
    modifier: Modifier = Modifier,
    CardColor: Color,
    painter: Painter,
    offerTitle: String,
    offerDetails: String,
    offerLastPrice: String,
    offerPrice: String,
) {
    val navController = LocalNavigationProvider.current

    Box(
        modifier = modifier.padding(bottom = 16.dp, start = 16.dp)
    ) {
        Card(
            elevation = CardDefaults.cardElevation(12.dp),
        ) {
            Column(
                modifier = Modifier
                    .size(width = 180.dp, height = 310.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(CardColor)
                    .padding(start = 8.dp, top = 8.dp)
                    .clickable { navController.navigateToDetails() },
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Card(
                    colors = CardDefaults.cardColors(White),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(4.dp)
                            .size(24.dp)
                            .align(Alignment.CenterHorizontally)
                            .clickable { },
                        painter = painterResource(R.drawable.ic_fav),
                        contentDescription = "",
                        tint = Primary
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = offerTitle,
                    style = Typography.titleMedium,
                    color = Black,
                )
                Text(
                    text = offerDetails,
                    style = Typography.bodySmall,
                    color = Black60,
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.padding(start = 72.dp, bottom = 16.dp)
                ) {
                    Text(
                        text = offerLastPrice,
                        style = Typography.bodyLarge,
                        color = Black60,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = offerPrice,
                        style = Typography.displaySmall,
                        color = Black,
                    )
                }
            }
        }

        Image(
            painter = painter,
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(start = 72.dp, top = 32.dp)
                .size(160.dp)
        )
    }
}