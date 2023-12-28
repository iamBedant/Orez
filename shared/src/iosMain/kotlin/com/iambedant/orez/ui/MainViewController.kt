package com.iambedant.orez.ui

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController(greet: String) = ComposeUIViewController { GreetingView(greet) }
