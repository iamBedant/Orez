package com.iambedant.network

import com.iambedant.base.scopes.ApplicationScope
import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin
import me.tatarka.inject.annotations.Provides

actual interface NetworkInfraComponent {
    @Provides
    @ApplicationScope
    fun providesHttpClient(): HttpClient {
        return httpClient(
            clientEngine = Darwin,
            config = { configureRequest { setAllowsCellularAccess(true) } }
        )
    }
}