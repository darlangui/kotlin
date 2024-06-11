package com.darlanguimaraes.pages.ui.modifiers

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class NoUnderLinePasswordVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val mask = AnnotatedString.Builder().apply {
            for (i in text.indices) {
                append("*")
            }
        }.toAnnotatedString()

        return TransformedText(mask, OffsetMapping.Identity)
    }
}