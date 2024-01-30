package com.iambedant.home.domain

import com.iambedant.home.ui.data.BottomNav

sealed class HomeEvent
data object FetchHomeData: HomeEvent()
data object ProfileClicked: HomeEvent()
data class NavItemClicked(val nav: BottomNav) : HomeEvent()
data class UpdateHomeData(val data: String): HomeEvent()