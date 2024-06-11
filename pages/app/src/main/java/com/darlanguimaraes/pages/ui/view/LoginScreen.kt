package com.darlanguimaraes.pages.ui.view


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darlanguimaraes.pages.R
import com.darlanguimaraes.pages.ui.theme.PagesTheme
import kotlin.math.sin

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

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
                    text = "Log In",
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                EmailTextField(email = email, onEmailChange = { email = it })
                PasswordTextField(password = password, onPasswordChange = { password = it })
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 32.dp, end = 32.dp)
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(
                        onClick = { /*TODO*/ },
                        interactionSource = remember { MutableInteractionSource() },
                    ) {
                        Text(
                            text = "Need Help?",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(end = 28.dp, start = 28.dp, top = 12.dp)
                        .fillMaxWidth()
                        .height(48.dp)
                        .shadow(elevation = 16.dp, shape = RoundedCornerShape(24.dp))
                ) {
                    Text(text = "PROCESS")
                }
            }
        }
    }
}

@Composable
fun EmailTextField(email: String, onEmailChange: (String) -> Unit, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = email,
        onValueChange = { onEmailChange(it) },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
            focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
            unfocusedLeadingIconColor = MaterialTheme.colorScheme.secondary,
            focusedTrailingIconColor = MaterialTheme.colorScheme.primary,
            unfocusedTrailingIconColor = MaterialTheme.colorScheme.secondary
        ),
        label = {
            Text(text = "Email")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Icone de email",
            )
        },
        singleLine = true,
        modifier = Modifier
            .padding(28.dp)
            .fillMaxWidth()
    )
}

@Composable
fun PasswordTextField(password: String, onPasswordChange: (String) -> Unit, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = password,
        onValueChange = { onPasswordChange(it) },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
            focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
            unfocusedLeadingIconColor = MaterialTheme.colorScheme.secondary,
            focusedTrailingIconColor = MaterialTheme.colorScheme.primary,
            unfocusedTrailingIconColor = MaterialTheme.colorScheme.secondary
        ),
        label = {
            Text(text = "Password")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Icone de senha",
            )
        },
        singleLine = true,
        modifier = Modifier
            .padding(end = 28.dp, start = 28.dp)
            .fillMaxWidth()
    )
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
private fun LoginScreenDarkPreview() {
    PagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            LoginScreen()
        }
    }
}

@LightPreview
@Composable
private fun LoginScreenLightPreview() {
    PagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            LoginScreen()
        }
    }
}



