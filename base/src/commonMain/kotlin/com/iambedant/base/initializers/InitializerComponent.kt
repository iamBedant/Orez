package com.iambedant.base.initializers

import com.iambedant.base.scopes.ApplicationScope
import me.tatarka.inject.annotations.IntoSet
import me.tatarka.inject.annotations.Provides

interface InitializerComponent {
    @IntoSet
    @Provides
    @ApplicationScope
    fun provideLogInitializer(bind: LogInitializer): Initializer = bind
}