package com.menna.donuts.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.menna.donuts.R
import com.menna.donuts.composable.ButtonItem
import com.menna.donuts.composable.TextItem
import com.menna.donuts.ui.theme.Black
import com.menna.donuts.ui.theme.Black60
import com.menna.donuts.ui.theme.Black80
import com.menna.donuts.ui.theme.Pink60
import com.menna.donuts.ui.theme.Primary
import com.menna.donuts.ui.theme.Typography
import com.menna.donuts.ui.theme.White

@Composable
fun DetailsScreen() {

    DetailsContent()
}

@Composable
fun DetailsContent(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxSize()
            .background(Pink60)
            .paint(
                painter = painterResource(R.drawable.img),
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.TopCenter
            )
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_arrow_back),
            contentDescription = "",
            modifier = modifier.padding(32.dp),
            tint = Primary
        )
        Box(
            contentAlignment = TopEnd
        ) {
            Surface(
                modifier = modifier
                    .clip(
                        RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
                    )
                    .fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(32.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    TextItem(text = "Strawberry Wheel", textColor = Primary, textStyle = Typography.displayMedium)
                    Spacer(modifier = modifier.height(33.dp))
                    TextItem(text = "About Gonut", textColor = Black80, textStyle = Typography.titleLarge )
                    Spacer(modifier = modifier.height(16.dp))
                    TextItem(text = stringResource(R.string.description), textColor = Black60, textStyle = Typography.bodyMedium)
                    Spacer(modifier = modifier.height(26.dp))
                    TextItem(text = "Quantity", textColor = Black80, textStyle = Typography.titleLarge)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(32.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = modifier.padding(20.dp)
                    ) {
                        TextItem(text = "-", textColor = Black, textStyle = Typography.labelMedium)
                        TextItem(text = "1", textColor = Black, textStyle = Typography.labelSmall)
                        Text(text = "+", color = White, style = Typography.labelMedium,
                            textAlign = TextAlign.Center, modifier = modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(color = Black)
                                .padding(horizontal = 12.dp)
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = modifier.fillMaxWidth()
                    ) {
                        TextItem(text = "£16", textColor = Black, textStyle = Typography.displayMedium)
                        ButtonItem(text = "Add to Cart", textColor = White,
                            buttonColor = Primary, modifier = Modifier.width(268.dp),
                            onClick = {}
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(24.dp)
                    .offset(0.dp, (-40).dp),
                colors = CardDefaults.cardColors(White),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(8.dp)
           ) {
                Icon(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(24.dp)
                        .align(CenterHorizontally),
                    painter = painterResource(R.drawable.ic_fav),
                    contentDescription = "",
                    tint = Primary
                )
            }
        }
    }
}