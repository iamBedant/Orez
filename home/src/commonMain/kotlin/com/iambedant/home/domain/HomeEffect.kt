package com.iambedant.home.domain

sealed class HomeEffect
data object  FetchHomeDataFromNetwork : HomeEffect()