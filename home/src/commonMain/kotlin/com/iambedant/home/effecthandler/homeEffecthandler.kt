package com.iambedant.home.effecthandler

import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.push
import com.iambedant.base.dispatchers.DispatcherProvider
import com.iambedant.home.HomeRepository
import com.iambedant.home.domain.FetchHomeDataFromNetwork
import com.iambedant.home.domain.HomeEffect
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.MoveToProfile
import com.iambedant.home.domain.UpdateHomeData
import com.iambedant.navigation.NavConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import kt.mobius.flow.FlowTransformer
import kt.mobius.flow.subtypeEffectHandler

fun createHomeEffectHandler(
    navigator: StackNavigation<NavConfig>,
    dispatcherProvider: DispatcherProvider,
    repository: HomeRepository,
): FlowTransformer<HomeEffect, HomeEvent> {
    return subtypeEffectHandler {
        addTransformer<FetchHomeDataFromNetwork> {
            fetchHomeDataFromNetwork(dispatcherProvider, repository, it)
        }
        addConsumer<MoveToProfile> {
            withContext(dispatcherProvider.main) {
                navigator.push(NavConfig.ProfileScreen)
            }
        }
    }
}

fun fetchHomeDataFromNetwork(
    dispatcherProvider: DispatcherProvider,
    repository: HomeRepository,
    flow: Flow<FetchHomeDataFromNetwork>
): Flow<HomeEvent> {
    return flow.flatMapMerge {
        repository
            .getData()
            .flowOn(dispatcherProvider.io)
            .map { UpdateHomeData(it) }
    }
}


