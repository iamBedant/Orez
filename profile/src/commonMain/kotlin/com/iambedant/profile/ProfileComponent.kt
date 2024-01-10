package com.iambedant.profile

import com.arkivanov.decompose.ComponentContext
import com.iambedant.base.dispatchers.DispatcherProvider
import me.tatarka.inject.annotations.Assisted
import me.tatarka.inject.annotations.Inject

@Inject
class ProfileComponent(
    @Assisted componentContext: ComponentContext,
    dispatcherProvider: DispatcherProvider
) : ComponentContext by componentContext {

}