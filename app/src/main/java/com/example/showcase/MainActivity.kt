package com.example.showcase

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.showcase.screen.Home
import com.example.showcase.ui.theme.ShowcaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowcaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "muhit $name!",
    color = Color.Cyan
    )
    Image(painter = painterResource(R.drawable.jokowi),
        contentDescription = "!",
    modifier = Modifier
        .clip(CircleShape)
        .size(50.dp))
}
@Composable
fun sayMyNum(name: String){
    Row() {
    Text(text = "abdul $name!")
    Button(onClick = { /*TODO*/ }) {
        Text(text = "ok")

    }
}
}
@Composable
fun incrementNumber(){
    var value by remember {
        mutableStateOf(0)
    }
    Column (modifier = Modifier) {
        Text(text = value.toString())
        Button(onClick = { value++}) {
            Text(text = "add")
            
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShowcaseTheme {
        Column(modifier = Modifier.fillMaxSize()) {

        }
        Column {

            Home()
            
        }

    }
}