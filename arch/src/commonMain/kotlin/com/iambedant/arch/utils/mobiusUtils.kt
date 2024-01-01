package com.iambedant.arch.utils

import kt.mobius.Connection
import kt.mobius.Next
import kt.mobius.Update
import kt.mobius.flow.FlowMobius
import kt.mobius.flow.FlowTransformer

private fun <M, E, F> updateWrapper(u: (M, E) -> Next<M, F>): Update<M, E, F> = Update { m: M, e: E -> u(m, e) }

fun <M, E, F> loopFactory(u: (M, E) -> Next<M, F>, fh: FlowTransformer<F, E>) = FlowMobius.loop(updateWrapper(u), fh)

class PartialConnection<T>(val onModelChange: (T) -> Unit) {
    fun onDispose(dispose: () -> Unit): Connection<T> = object : Connection<T> {
        override fun accept(value: T) {
            onModelChange(value)
        }

        override fun dispose() {
            dispose()
        }
    }
}

fun <T> onAccept(onModelChange: (T) -> Unit): PartialConnection<T> = PartialConnection(onModelChange)
