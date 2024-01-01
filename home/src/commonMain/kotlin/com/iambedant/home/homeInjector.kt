package com.iambedant.home

import com.iambedant.arch.logger.OrezMobiusLogger
import com.iambedant.arch.utils.loopFactory
import com.iambedant.home.domain.HomeEffect
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.HomeModel
import com.iambedant.home.logic.init
import com.iambedant.home.logic.update
import kt.mobius.EventSource
import kt.mobius.Mobius
import kt.mobius.MobiusLoop
import kt.mobius.flow.FlowTransformer

fun createController(
    effectHandler: FlowTransformer<HomeEffect, HomeEvent>,
    eventSource: EventSource<HomeEvent>,
    defaultModel: HomeModel
): MobiusLoop.Controller<HomeModel, HomeEvent> =
    Mobius.controller(
        createLoop(eventSource, effectHandler),
        defaultModel,
        ::init
    )


private fun createLoop(
    eventSource: EventSource<HomeEvent>,
    effectHandler: FlowTransformer<HomeEffect, HomeEvent>
): MobiusLoop.Factory<HomeModel, HomeEvent, HomeEffect> =
    loopFactory(::update, effectHandler)
        .eventSource(eventSource)
        .logger(OrezMobiusLogger.tag("Home Mobius Logger"))
