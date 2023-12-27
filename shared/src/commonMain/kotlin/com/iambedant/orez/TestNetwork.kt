package com.iambedant.orez

import com.iambedant.base.dispatchers.DispatcherProvider
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.tatarka.inject.annotations.Inject

@Inject
class TestNetwork(
    val dispatcherProvider: DispatcherProvider,
    private val httpClient: HttpClient
) {
    fun callNetwork(){

        val coroutineScope = CoroutineScope(SupervisorJob() + dispatcherProvider.io)
        coroutineScope.launch {
            callActualApi()
        }
    }

    suspend fun callActualApi(): String {
        val response =  httpClient.get("https://api.github.com/users/iambedant")
        return when(response.status){
            HttpStatusCode.OK -> {
                response.body()
            }

            else -> {
                response.status.description
            }
        }
    }
}