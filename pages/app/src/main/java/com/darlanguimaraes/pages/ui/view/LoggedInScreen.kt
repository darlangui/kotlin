package com.darlanguimaraes.pages.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.darlanguimaraes.pages.ui.components.CustomButtom
import com.darlanguimaraes.pages.ui.modifiers.DarkPreview
import com.darlanguimaraes.pages.ui.theme.PagesTheme

@Composable
fun LoggedInScreen(modifier: Modifier = Modifier) {
    Box(
        modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Logged",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .padding(40.dp)
                    .offset(
                        y = (-100).dp
                    )
            )
            CustomButtom(
                text = "Log Out",
                onClickAction = { /*TODO*/ },
                modifier = Modifier
                    .padding(end = 28.dp, start = 28.dp)
                    .height(48.dp)
                    .offset(
                        y = (-80).dp
                    )
            )
        }
    }
}

@DarkPreview
@Composable
fun LoggedInScreenDarkPreview() {
    PagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            LoggedInScreen()
        }
    }
}