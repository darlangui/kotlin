package com.darlanguimaraes.pages.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.darlanguimaraes.pages.R
import com.darlanguimaraes.pages.ui.components.CustomButtom
import com.darlanguimaraes.pages.ui.components.CustomTextField
import com.darlanguimaraes.pages.ui.modifiers.DarkPreview
import com.darlanguimaraes.pages.ui.modifiers.LightPreview
import com.darlanguimaraes.pages.ui.theme.PagesTheme

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                CustomTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = "Name",
                    leadingIcon = Icons.Default.AccountBox,
                    modifier = Modifier.padding(28.dp)
                )
                CustomTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = "Email",
                    leadingIcon = Icons.Default.Email,
                    modifier = Modifier.padding(start = 28.dp, end = 28.dp, bottom = 28.dp)
                )
                CustomTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = "Password",
                    leadingIcon = Icons.Default.Password,
                    trailingIcon = Icons.Default.RemoveRedEye,
                    isPassword = true,
                    modifier = Modifier.padding(start = 28.dp, end = 28.dp),
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp)
                ) {
                    ClickableText(
                        text = AnnotatedString("Term Of Service and Policy"),
                        onClick = { },
                        style = MaterialTheme.typography.bodyMedium
                            .copy(color = MaterialTheme.colorScheme.secondary),
                        modifier = Modifier.padding(top = 12.dp, bottom = 12.dp, start = 8.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                }
                CustomButtom(
                    text = "REGISTER",
                    onClickAction = { /*TODO*/ },
                    modifier = Modifier
                        .padding(end = 28.dp, start = 28.dp, top = 12.dp)
                        .height(48.dp)
                )
            }
        }
    }
}

@DarkPreview
@Composable
private fun RegisterScreenDarkPreview() {
    PagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            RegisterScreen()
        }
    }
}

@LightPreview
@Composable
private fun RegisterScreenLightPreview() {
    PagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            RegisterScreen()
        }
    }
}