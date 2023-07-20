package com.menna.donuts.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.donuts.R
import com.menna.donuts.composable.TextItem
import com.menna.donuts.ui.theme.Black60
import com.menna.donuts.ui.theme.Pink60
import com.menna.donuts.ui.theme.Primary
import com.menna.donuts.ui.theme.Typography

@Composable
fun Header() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(end = 16.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Column() {
            TextItem(text = "Let’s Gonuts!", textColor = Primary, textStyle = Typography.displayMedium)
            TextItem(text = "Order your favourite donuts from here", textColor = Black60, textStyle = Typography.titleSmall)
        }
        Icon(painter = painterResource(R.drawable.ic_round_search),
            contentDescription = "",
            tint = Primary,
            modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(Pink60).padding(8.dp)
        )
    }
}