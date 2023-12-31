package com.iambedant.arch

import kotlinx.coroutines.flow.StateFlow
import kt.mobius.MobiusLoop

interface ViewModel<UI,E, M> {
     val data: StateFlow<UI>
     fun dispatchEvent(event: E)
     val mController: MobiusLoop.Controller<M, E>
}