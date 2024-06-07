package com.darlanguimaraes.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.darlanguimaraes.views.ui.theme.ViewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .border(
                0.5.dp, Color.Gray.copy(alpha = 0.5f), RoundedCornerShape(20.dp)
            )
    ) {
        AsyncImage(
            model = "",
            contentDescription = "Imagem de capa",
            Modifier
                .height(100.dp)
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp, topEnd = 20.dp
                    )
                ),
            placeholder = ColorPainter(Color.Gray),
            contentScale = ContentScale.Crop
        )
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(
                text = "Yuri", fontSize = 24.sp
            )
            Text(
                text = "coda foo", fontSize = 14.sp
            )
        }
        Row(
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Outlined.FavoriteBorder, contentDescription = "icone de favorito"
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Concord")
            }
        }
    }
}


@Preview
@Composable
private fun AppView() {
    ViewsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}

