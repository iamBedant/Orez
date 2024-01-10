package com.iambedant.orez.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.iambedant.home.Home
import com.iambedant.orez.nav.AppComponent
import com.iambedant.orez.nav.Screen
import com.iambedant.profile.Profile
import me.tatarka.inject.annotations.Inject

typealias App = @Composable () -> Unit

@Inject
@Composable
fun App(component: AppComponent) {
    MaterialTheme {
        Children(
            modifier = Modifier.fillMaxSize(),
            stack = component.navStack,
            animation = stackAnimation(slide())
        ) { child ->
            val fillMaxSizeModifier = Modifier.fillMaxSize()
            when (val screen = child.instance) {
                is Screen.Home -> Home(screen.component, fillMaxSizeModifier)
                is Screen.Profile -> Profile(screen.component, fillMaxSizeModifier)
            }
        }
    }
}