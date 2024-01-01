package com.iambedant.arch.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

actual fun createDefaultCoroutineScope(): CoroutineScope {
    return MainScope()
}