package com.iambedant.home.domain

data class HomeModel (
    val isLoading: Boolean
) {
    fun convertToUiData(): HomeUiModel {
        TODO("Not yet implemented")
    }
    companion object {
        fun defaultModel(): HomeModel {
            return HomeModel(false)
        }
    }
}

data class HomeUiModel(
    val shouldShowLoading: Boolean
)