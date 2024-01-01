package com.iambedant.home.effecthandler

import com.iambedant.home.domain.FetchHomeDataFromNetwork
import com.iambedant.home.domain.HomeEffect
import com.iambedant.home.domain.HomeEvent
import kotlinx.coroutines.flow.Flow
import kt.mobius.flow.FlowTransformer
import kt.mobius.flow.subtypeEffectHandler

fun createHomeEffectHandler(): FlowTransformer<HomeEffect, HomeEvent> {
    return subtypeEffectHandler {
        addTransformer<FetchHomeDataFromNetwork> { fetchHomeDataFromNetwork() }
    }
}

fun fetchHomeDataFromNetwork(): Flow<HomeEvent> {
    TODO()
}


