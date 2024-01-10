package com.iambedant.home

import com.iambedant.base.dispatchers.DispatcherProvider
import com.iambedant.base.scopes.ApplicationScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import me.tatarka.inject.annotations.Inject

@Inject
@ApplicationScope
class HomeRepository(
    private val dispatcherProvider: DispatcherProvider
) {
    suspend fun getData() : Flow<String>{
        return flow {
            delay(4000)
            emit("Updated Data")
        }
    }
}