package com.iambedant.home

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.essenty.instancekeeper.InstanceKeeper
import com.arkivanov.essenty.instancekeeper.getOrCreate
import com.arkivanov.essenty.lifecycle.doOnCreate
import com.iambedant.arch.Component
import com.iambedant.arch.utils.DeferredEventSource
import com.iambedant.arch.utils.onAccept
import com.iambedant.base.dispatchers.DispatcherProvider
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.HomeModel
import com.iambedant.home.domain.HomeUiModel
import com.iambedant.home.effecthandler.createHomeEffectHandler
import com.iambedant.navigation.NavConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kt.mobius.Connectable
import kt.mobius.Connection
import kt.mobius.MobiusLoop
import kt.mobius.functions.Consumer
import me.tatarka.inject.annotations.Assisted
import me.tatarka.inject.annotations.Inject

@Inject
class HomeComponent(
    dispatcherProvider: DispatcherProvider,
    @Assisted componentContext: ComponentContext,
    private val navigator: StackNavigation<NavConfig>,
    private val repository: HomeRepository
) : ComponentContext by componentContext {

    private val componentInstance =
        instanceKeeper.getOrCreate {
            ComponentInstance(
                dispatchersProvider = dispatcherProvider,
                navigator,
                repository
            )
        }

    internal val data = componentInstance.data
    fun getEventSource() = componentInstance.getEventSource()


    init {
        lifecycle.doOnCreate {
            componentInstance.mController.start()
        }
    }

    private class ComponentInstance(
        private val dispatchersProvider: DispatcherProvider,
        private val navigator: StackNavigation<NavConfig>,
        private val repository: HomeRepository
    ) : InstanceKeeper.Instance, Connectable<HomeModel, HomeEvent>, Component<HomeUiModel,HomeEvent, HomeModel> {

        private val coroutineScope = CoroutineScope(SupervisorJob() + dispatchersProvider.main)
        private val eventSource = DeferredEventSource<HomeEvent>()
        private val _data = MutableStateFlow(HomeModel.defaultModel().convertToUiData())
        override val data: StateFlow<HomeUiModel>
            get() = _data
        override val mController: MobiusLoop.Controller<HomeModel, HomeEvent>
            get() = createController(
                createHomeEffectHandler(navigator, dispatchersProvider, repository),
                eventSource,
                HomeModel.defaultModel()
            ).also {
                it.connect(this)
            }

        override fun connect(output: Consumer<HomeEvent>): Connection<HomeModel> {
            return onAccept<HomeModel> {
                _data.value = it.convertToUiData()
            }.onDispose { }
        }

        override fun onDestroy() {
            coroutineScope.cancel()
            mController.run {
                disconnect()
                stop()
            }
            super.onDestroy()
        }

        fun getEventSource() = eventSource

    }
}