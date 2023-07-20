package com.menna.donuts.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TextItem(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    textStyle: TextStyle,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text = text,
        color = textColor,
        style = textStyle,
        textAlign = textAlign,
        modifier = modifier.padding(start = 16.dp)
    )
}