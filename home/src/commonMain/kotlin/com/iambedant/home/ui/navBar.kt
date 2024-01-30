package com.iambedant.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.iambedant.arch.utils.DeferredEventSource
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.NavItemClicked
import com.iambedant.home.ui.data.BottomNav
import com.iambedant.home.ui.data.BottomNavItem
import com.iambedant.home.ui.data.provideBottomNavItems
import com.iambedant.theme.OrezColors
import kotlinx.collections.immutable.ImmutableList

@Composable
fun BottomNav(
    modifier: Modifier = Modifier,
    navItems: ImmutableList<BottomNavItem> = provideBottomNavItems(),
    eventSource: DeferredEventSource<HomeEvent>,
    currentSelected: BottomNav
) {
    Row(
        Modifier.fillMaxWidth().height(60.dp).background(OrezColors.primaryColorDarkBlue),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (navItem in navItems) {
            val navItemSelected = remember {
                { eventSource.notifyEvent(NavItemClicked(navItem.type)) }
            }
            NavItem(
                imageVector = navItem.icon,
                contentDescription = navItem.contentDescription,
                onClick = navItemSelected,
                isSelected = navItem.type == currentSelected
            )
        }
    }
}

@Composable
fun RowScope.NavItem(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    isSelected: Boolean
) {
    Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = if(isSelected) OrezColors.colorAccentGreen else OrezColors.primaryColorBlue,
        modifier = Modifier.clickable { onClick.invoke() }.weight(1F).padding(18.dp),
    )
}