package com.iambedant.orez.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun GreetingView(text: String) {
    MaterialTheme {
        Text(text = text)
    }
}