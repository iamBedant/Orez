package com.iambedant.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.plugins.cache.HttpCache
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.github.aakira.napier.log

fun <T : HttpClientEngineConfig> httpClient(
    clientEngine: HttpClientEngineFactory<T>,
    config: T.() -> Unit
): HttpClient {
    return HttpClient(clientEngine) {
        followRedirects = false
        engine { config() }
        install(HttpCache)
        install(Logging) {
            level = LogLevel.ALL
            logger =
                object : Logger {
                    override fun log(message: String) {
                        log(tag = "|| Ktor Client ||") { message }
                    }
                }
        }
    }
}