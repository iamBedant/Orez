package com.iambedant.home.domain

import com.iambedant.home.ui.data.BottomNav
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class HomeModel(
    val isLoading: Boolean,
    val data: String = "",
    val selectedTab: BottomNav = BottomNav.Explore,
) {
    fun convertToUiData(): HomeUiModel {
        return HomeUiModel(
            isLoading,
            data,
            persistentListOf(),
            selectedTab
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
    val heroItems: ImmutableList<HeroItem>,
    val selectedTab: BottomNav,
)

data class HeroItem(
    val imageUrl: String,
    val name: String,
    val videoUrl: String,
    val tags: List<String>
)