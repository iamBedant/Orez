package com.iambedant.orez.android

import android.app.Application
import com.iambedant.orez.di.ApplicationComponent
import com.iambedant.orez.di.create

class OrezApp : Application() {
    val appComponent by
    lazy(LazyThreadSafetyMode.NONE) { ApplicationComponent::class.create() }

    override fun onCreate() {
        super.onCreate()
        appComponent.initializers.forEach { it.initialize() }
    }
}