package com.iambedant.home

import com.iambedant.arch.ViewModel
import com.iambedant.arch.utils.DeferredEventSource
import com.iambedant.arch.utils.onAccept
import com.iambedant.home.domain.HomeEvent
import com.iambedant.home.domain.HomeModel
import com.iambedant.home.domain.HomeUiModel
import com.iambedant.home.effecthandler.createHomeEffectHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kt.mobius.Connectable
import kt.mobius.Connection
import kt.mobius.MobiusLoop
import kt.mobius.functions.Consumer
import kotlin.coroutines.CoroutineContext

class HomeViewModel() : Connectable<HomeModel, HomeEvent>,
    ViewModel<HomeUiModel, HomeEvent, HomeModel>, CoroutineScope {

    private val eventSource = DeferredEventSource<HomeEvent>()
    private val _data = MutableStateFlow(HomeModel.defaultModel().convertToUiData())
    override val data: StateFlow<HomeUiModel>
        get() = _data
    override val mController: MobiusLoop.Controller<HomeModel, HomeEvent>
        get() = createController(
            createHomeEffectHandler(),
            eventSource,
            HomeModel.defaultModel()
        )

    override val coroutineContext: CoroutineContext
        get() = Job() + Dispatchers.Main

    override fun connect(output: Consumer<HomeEvent>): Connection<HomeModel> {
        return onAccept<HomeModel> {
            _data.value = it.convertToUiData()
        }.onDispose { }
    }

    override fun dispatchEvent(event: HomeEvent) {
        eventSource.notifyEvent(event)
    }
}