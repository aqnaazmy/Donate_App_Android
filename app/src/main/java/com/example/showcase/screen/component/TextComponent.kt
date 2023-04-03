package com.example.showcase.screen.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent (text : String,
                   color: Color,
                   fontWeight: FontWeight,
                   fontSize : TextUnit) {

    Text(text =text,
    style = TextStyle(
        color = color,
        fontWeight = fontWeight,
        fontSize = fontSize

    )
    )
}