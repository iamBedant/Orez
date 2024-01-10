package com.iambedant.orez.nav

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.essenty.instancekeeper.InstanceKeeper
import com.arkivanov.essenty.instancekeeper.getOrCreate
import com.arkivanov.essenty.lifecycle.doOnStart
import com.iambedant.base.dispatchers.DispatcherProvider
import com.iambedant.base.scopes.ActivityScope
import com.iambedant.home.HomeComponent
import com.iambedant.home.HomeRepository
import com.iambedant.navigation.NavConfig
import com.iambedant.profile.ProfileComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import me.tatarka.inject.annotations.Inject

@Inject
@ActivityScope
class AppComponent(
    private val dispatcherProvider: DispatcherProvider,
    private val componentContext: ComponentContext,
    private val repository: HomeRepository
) : ComponentContext by componentContext {

    private val componentInstance = instanceKeeper.getOrCreate {
        ComponentInstance(dispatcherProvider)
    }

    private val navigation = StackNavigation<NavConfig>()

    val navStack = childStack(
        source = navigation,
        serializer = NavConfig.serializer(),
        initialConfiguration = NavConfig.HomeScreen,
        handleBackButton = true,
        childFactory = ::createScreen,
    )

    init {
        lifecycle.doOnStart { componentInstance.initAppIfNeeded() }
    }

    private fun createScreen(config: NavConfig, componentContext: ComponentContext): Screen {
        return when (config) {
            NavConfig.HomeScreen -> Screen.Home(
                HomeComponent(
                    dispatcherProvider,
                    componentContext,
                    navigation,
                    repository
                )
            )

            NavConfig.ProfileScreen -> Screen.Profile(
                ProfileComponent(
                    componentContext,
                    dispatcherProvider
                )
            )
        }
    }

    private class ComponentInstance(
        dispatcherProvider: DispatcherProvider,
    ) : InstanceKeeper.Instance {
        private val coroutineScope = CoroutineScope(SupervisorJob() + dispatcherProvider.main)

        override fun onDestroy() {
            coroutineScope.cancel()
            super.onDestroy()
        }

        fun initAppIfNeeded() {

        }
    }
}