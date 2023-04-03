package com.example.showcase.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.showcase.R

@Composable
fun ImageComponent (img: Int, modifier: Modifier) {
    Image(
        painter = painterResource(id = img),
        contentDescription ="image",
        modifier = Modifier

    )
}

@Preview
@Composable
fun PriviewImage(){
    Surface(modifier = Modifier.fillMaxSize()) {
    }
}