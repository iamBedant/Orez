package com.iambedant.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iambedant.home.domain.HeroItem
import com.iambedant.home.ui.BottomNav
import com.iambedant.home.ui.ToolBar
import com.iambedant.home.ui.data.BottomNav
import com.iambedant.theme.OrezColors
import kotlinx.collections.immutable.ImmutableList

@Composable
fun Home(
    component: HomeComponent,
    modifier: Modifier = Modifier
) {
    val state = component.data.collectAsState()

    Surface(Modifier.fillMaxSize().background(OrezColors.primaryColorBlue)) {
        Column(Modifier.fillMaxSize().background(OrezColors.primaryColorBlue)) {
            ToolBar()
            HomeContent(
                modifier = Modifier.weight(1F),
                selectedTab = state.value.selectedTab
            )
            BottomNav(
                eventSource = component.getEventSource(),
                currentSelected = state.value.selectedTab
            )
        }
    }
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    selectedTab: BottomNav
) {
    when (selectedTab) {
        BottomNav.Explore -> Explore(modifier)
        BottomNav.Download -> Download(modifier)
        BottomNav.BlueTooth -> BlueTooth(modifier)
        BottomNav.Info -> Info(modifier)
    }
}

@Composable
fun Info(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize().background(OrezColors.primaryColorDarkBlue)) {
        Text("Info")
    }

}

@Composable
fun BlueTooth(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize().background(OrezColors.secondaryColorYellow)) {
        Text("BlueTooth")
    }

}

@Composable
fun Download(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize().background(OrezColors.colorAccentGreen)) {
        Text("Download")
    }

}

@Composable
fun Explore(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize().background(OrezColors.secondaryColorYellowLight)) {
        Text("Explore")
    }

}

@Composable
fun HeroView(heroItems: ImmutableList<HeroItem>) {

}
