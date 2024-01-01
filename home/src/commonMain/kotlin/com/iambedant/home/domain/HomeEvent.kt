package com.iambedant.home.domain

sealed class HomeEvent
data object FetchHomeData: HomeEvent()