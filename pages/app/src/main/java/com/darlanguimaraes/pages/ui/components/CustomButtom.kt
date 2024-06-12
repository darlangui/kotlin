package com.darlanguimaraes.pages.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

@Composable
fun CustomButtom(text: String, onClickAction: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClickAction,
        modifier
            .fillMaxWidth()
            .shadow(elevation = 16.dp, shape = RoundedCornerShape(2.dp)),
        shape = RoundedCornerShape(bottomStart = 20.dp, topEnd = 20.dp),
    ) {
        Text(text = text)
    }
}