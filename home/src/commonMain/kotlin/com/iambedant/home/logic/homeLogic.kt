package com.iambedant.home.logic

import com.iambedant.home.domain.FetchHomeData
import com.iambedant.home.domain.FetchHomeDataFromNetwork
import com.iambedant.home.domain.HomeEffect
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.HomeModel
import com.iambedant.home.domain.MoveToProfile
import com.iambedant.home.domain.NavItemClicked
import com.iambedant.home.domain.ProfileClicked
import com.iambedant.home.domain.UpdateHomeData
import kt.mobius.Effects
import kt.mobius.First
import kt.mobius.Next


fun init(model: HomeModel): First<HomeModel, HomeEffect> =
    First.first(
        model,
        Effects.effects(FetchHomeDataFromNetwork)
    )

fun update(model: HomeModel, event: HomeEvent): Next<HomeModel, HomeEffect> =
    when (event) {
        FetchHomeData -> Next.noChange()
        ProfileClicked -> Next.dispatch(Effects.effects(MoveToProfile))
        is UpdateHomeData -> Next.next(model.copy(data = event.data))
        is NavItemClicked -> Next.next(model.copy(selectedTab = event.nav))
    }