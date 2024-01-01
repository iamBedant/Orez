package com.iambedant.home.logic

import com.iambedant.home.domain.FetchHomeData
import com.iambedant.home.domain.HomeEffect
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.HomeModel
import kt.mobius.Effects
import kt.mobius.First
import kt.mobius.Init
import kt.mobius.Next


fun init(model: HomeModel): First<HomeModel, HomeEffect> =
    First.first(
        model,
    )

fun update(model: HomeModel, event: HomeEvent): Next<HomeModel, HomeEffect> =
    when (event) {
        FetchHomeData -> TODO()
    }