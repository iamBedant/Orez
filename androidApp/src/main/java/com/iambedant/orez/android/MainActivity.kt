package com.iambedant.orez.android

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.defaultComponentContext
import com.iambedant.base.scopes.ActivityScope
import com.iambedant.orez.di.ApplicationComponent
import com.iambedant.orez.ui.App
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityComponent = ActivityComponent::class.create(activity = this)
        setContent {
            activityComponent.app()
        }
    }
}

@Component
@ActivityScope
abstract class ActivityComponent(
    @get:Provides val activity: ComponentActivity,
    @get:Provides val componentContext: ComponentContext = activity.defaultComponentContext(),
    @Component val applicationComponent: ApplicationComponent = (activity.applicationContext as OrezApp).appComponent
) {
    abstract val app: App
}