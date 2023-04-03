package com.example.showcase.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.showcase.R
import com.example.showcase.screen.component.ImageComponent
import com.example.showcase.screen.component.TextComponent

@Composable
fun Home () {

    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ){
        ImageComponent(img = R.drawable.thumnail, modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp)))

        Spacer(modifier = Modifier.height(10.dp))

        Column {
            var modifire = Modifier
                .padding(10.dp)
            TextComponent(
                text = stringResource(id = R.string.title) ,
                color = Color.Black ,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp)
            Spacer(modifier = Modifier.height(10.dp))


            Row {
                ImageComponent(img = R.drawable.vector,
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp))

                Spacer(modifier = Modifier.width(10.dp))

                TextComponent(text = stringResource(id = R.string.foundation) ,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold ,
                    fontSize = 18.sp )
                Spacer(modifier = Modifier.height(10.dp))
            }

            Spacer(modifier = Modifier.height(10.dp))


            TextComponent(text = stringResource(id = R.string.description) ,
                color = Color.Gray,
                fontWeight = FontWeight.W400,
                fontSize = 15.sp )
            Spacer(modifier = Modifier.height(10.dp))


            Row() {
                Column(modifier = Modifier
                    .weight(1f)) {
                    TextComponent(text = stringResource(id = R.string.donated) ,
                        color = Color.Gray,
                        fontWeight = FontWeight.W400,
                        fontSize = 18.sp )
                    Row() {
                        for (i in 1..4){
                            ImageComponent(
                                img = R.drawable.ellipse,
                                modifier = Modifier
                                    .clip(shape = RoundedCornerShape(10.dp))
                                    .width(30.dp)
                                    .height(30.dp)
                            )

                        }
                    }

                }

                Column(modifier = Modifier
                    .weight(1f)) {


                    TextComponent(
                        text = stringResource(id = R.string.total_donated) ,
                        color = Color.Gray,
                        fontWeight = FontWeight.W400,
                        fontSize = 18.sp)
                    TextComponent(
                        text = stringResource(id = R.string.total_money),
                        color = Color.Black,
                        fontWeight = FontWeight.W700,
                        fontSize = 18.sp)
                    Spacer(modifier = Modifier.width(10.dp))
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextComponent(
                    text =  stringResource(id = R.string.button_donate),
                    color = Color.White,
                    fontWeight = FontWeight.W700,
                    fontSize = 18.sp)

            }
        }


    }
}
@Preview
@Composable
fun homePreview (){
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
        Home()
    }
}

