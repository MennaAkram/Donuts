package com.menna.donuts.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.menna.donuts.ui.theme.Typography

@Composable
fun ButtonItem(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    buttonColor: Color,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(buttonColor),
        contentPadding = PaddingValues(horizontal = 20.dp),
        modifier = modifier
            .height(64.dp)
    ) {
        TextItem(text = text, textColor = textColor, textStyle = Typography.labelLarge)
    }
}