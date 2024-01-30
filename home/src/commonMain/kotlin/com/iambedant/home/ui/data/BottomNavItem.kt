package com.iambedant.home.ui.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.iambedant.icons.Bluetooth
import com.iambedant.icons.Download
import com.iambedant.icons.Home
import com.iambedant.icons.Info
import com.iambedant.icons.OrezIcons
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class BottomNavItem(
    val type: BottomNav,
    val isSelected: Boolean,
    val icon: ImageVector,
    val contentDescription: String
)

enum class BottomNav {
    Explore,
    Download,
    BlueTooth,
    Info
}

fun provideBottomNavItems(): ImmutableList<BottomNavItem> {
    return persistentListOf(
        BottomNavItem(
            type = BottomNav.Explore,
            isSelected = true,
            icon = OrezIcons.Home,
            contentDescription = "Explore"
        ),
        BottomNavItem(
            type = BottomNav.Download,
            isSelected = false,
            icon = OrezIcons.Download,
            contentDescription = "Download"
        ),
        BottomNavItem(
            type = BottomNav.BlueTooth,
            isSelected = false,
            icon = OrezIcons.Bluetooth,
            contentDescription = "Bluetooth"
        ),
        BottomNavItem(
            type = BottomNav.Info,
            isSelected = false,
            icon = OrezIcons.Info,
            contentDescription = "Info"
        )
    )
}