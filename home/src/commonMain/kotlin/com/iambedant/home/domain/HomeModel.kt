package com.iambedant.home.domain

data class HomeModel(
    val isLoading: Boolean,
    val data: String = "",
) {
    fun convertToUiData(): HomeUiModel {
        return HomeUiModel(
            isLoading,
            data
        )
    }

    companion object {
        fun defaultModel(): HomeModel {
            return HomeModel(false)
        }
    }
}

data class HomeUiModel(
    val shouldShowLoading: Boolean,
    val message: String,
)