package com.iambedant.orez.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.iambedant.orez.ui.GreetingView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingView((this.application as OrezApp).appComponent.greeter.greet())
        }
    }
}
