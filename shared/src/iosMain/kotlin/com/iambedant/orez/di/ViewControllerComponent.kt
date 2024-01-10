package com.iambedant.orez.di

import com.arkivanov.decompose.ComponentContext
import com.iambedant.base.scopes.ActivityScope
import com.iambedant.orez.ui.MainViewController
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@Component
@ActivityScope
abstract class ViewControllerComponent(
    @get:Provides val componentContext: ComponentContext,
    @Component val applicationComponent: ApplicationComponent
) {

    abstract val homeViewControllerFactory: MainViewController
}
