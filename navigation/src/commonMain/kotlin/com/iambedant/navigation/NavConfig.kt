package com.iambedant.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavConfig {
    @Serializable
    data object HomeScreen : NavConfig()

    @Serializable
    data object ProfileScreen : NavConfig()
}
