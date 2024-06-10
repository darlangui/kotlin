package com.darlanguimaraes.pages.ui.view


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darlanguimaraes.pages.R
import com.darlanguimaraes.pages.ui.theme.PagesTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf(TextFieldValue()) }
    Box(
        modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary),
        contentAlignment = Alignment.BottomEnd
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.65f)
                .background(
                    MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp)
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Log In", modifier.padding(16.dp),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.secondary,
            )

            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.9f),
                label = {
                    Text(text = "Email")
                },
                trailingIcon = {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "Content OK")
                },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                    unfocusedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                ),
            )
            Spacer(modifier = Modifier.height(12.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.9f)
                    .background(Color.Transparent, shape = MaterialTheme.shapes.small),
                label = {
                    Text(text = "Password")
                },
                trailingIcon = {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "Content OK")
                },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                    unfocusedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                ),
            )
            Row (
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.9f),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Need Help?",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary,
                )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.23f),
            ) {
                Text(text = "PROCEED")
            }
            Text(
                text = "Or Log In With",
                modifier = Modifier.padding(vertical = 16.dp),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.tertiary,
            )
        }
    }
    Box(
    ){
        Image(
            painter = painterResource(id = R.drawable.planet),
            contentDescription = "Planeta roxo",
            modifier = Modifier.size(height = 500.dp, width = 500.dp)
        )
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


