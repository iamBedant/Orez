package com.iambedant.home.domain

sealed class HomeEvent
data object FetchHomeData: HomeEvent()
data object ProfileClicked: HomeEvent()

data class UpdateHomeData(val data: String): HomeEvent()