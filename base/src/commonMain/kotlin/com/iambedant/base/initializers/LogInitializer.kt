package com.iambedant.base.initializers

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import me.tatarka.inject.annotations.Inject

@Inject
class LogInitializer : Initializer {

    override fun initialize() {
        Napier.base(DebugAntilog())
    }
}