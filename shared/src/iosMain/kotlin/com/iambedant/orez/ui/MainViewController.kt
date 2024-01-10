package com.iambedant.orez.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.PredictiveBackGestureOverlay
import com.arkivanov.essenty.backhandler.BackDispatcher
import me.tatarka.inject.annotations.Assisted
import me.tatarka.inject.annotations.Inject
import platform.UIKit.UIViewController

typealias MainViewController = (backDispatcher: BackDispatcher) -> UIViewController

@OptIn(ExperimentalDecomposeApi::class)
@Inject
fun MainViewController(app: App, @Assisted backDispatcher: BackDispatcher) =
    ComposeUIViewController(configure = { onFocusBehavior = OnFocusBehavior.DoNothing }) {
        PredictiveBackGestureOverlay(
            backDispatcher = backDispatcher,
            backIcon = null,
            modifier = Modifier.fillMaxSize()
        ) {
            app()
        }
    }