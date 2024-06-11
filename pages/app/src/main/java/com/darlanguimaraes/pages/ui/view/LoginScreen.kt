package com.darlanguimaraes.pages.ui.view


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darlanguimaraes.pages.R
import com.darlanguimaraes.pages.ui.theme.PagesTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.planet),
            contentDescription = "Imagem ilustrativa de planetas usada na tela de login",
            contentScale = ContentScale.Crop,
            modifier = Modifier.offset(y = ((-44).dp))
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 260.dp)
                .background(
                    MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp)
                ),
            contentAlignment = Alignment.Center,
        ) {

        }

    }
}

@Preview(
    name = "Light Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO
)
annotation class LightPreview

@Preview(
    name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES
)
annotation class DarkPreview

@DarkPreview
@Composable
private fun LoginScreenPreview() {
    PagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            LoginScreen()
        }
    }
}


