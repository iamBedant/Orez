package com.iambedant.orez.di

import com.iambedant.base.dispatchers.AppDispatcherProvider
import com.iambedant.base.dispatchers.DispatcherProvider
import com.iambedant.base.initializers.Initializer
import com.iambedant.base.initializers.InitializerComponent
import com.iambedant.base.scopes.ApplicationScope
import com.iambedant.network.NetworkInfraComponent
import me.tatarka.inject.annotations.Provides

abstract class SharedComponent : NetworkInfraComponent, InitializerComponent {

    abstract val initializers: Set<Initializer>

    @Provides
    @ApplicationScope
    fun appDispatcherProvider(): DispatcherProvider = AppDispatcherProvider()
}