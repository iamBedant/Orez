package com.iambedant.arch.utils


import androidx.compose.runtime.Stable
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kt.mobius.EventSource
import kt.mobius.disposables.Disposable
import kt.mobius.functions.Consumer

expect fun createDefaultCoroutineScope(): CoroutineScope

@Stable
class DeferredEventSource<E> : EventSource<E> {

    private val events = Channel<E>()
    private val coroutineScope: CoroutineScope = createDefaultCoroutineScope()

    override fun subscribe(eventConsumer: Consumer<E>): Disposable {
        val job = coroutineScope.launch {
            for (e in events) {
                eventConsumer.accept(e)
            }
        }

        return Disposable { job.cancel() }
    }

    fun notifyEvent(e: E) {
        coroutineScope.launch {
            events.send(e)
        }
    }
}