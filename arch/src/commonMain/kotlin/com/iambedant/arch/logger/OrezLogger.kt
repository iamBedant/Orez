package com.iambedant.arch.logger

import io.github.aakira.napier.log
import kt.mobius.First
import kt.mobius.MobiusLoop
import kt.mobius.Next

class OrezMobiusLogger<M, E, F>(tag: String?) : MobiusLoop.Logger<M, E, F> {
    private val tag: String

    init {
        this.tag = checkNotNull(tag)
    }

    override fun beforeInit(model: M) {
        log(tag = tag) { "  --->  Initializing loop" }
    }

    override fun afterInit(model: M, result: First<M, F>) {
        log(tag = tag) { "  --->  " + "Loop initialized, starting from model: " + result.model() }
        for (effect in result.effects()) {
            log(tag = tag) { "  --->  Effect dispatched: $effect" }
        }
    }

    override fun exceptionDuringInit(model: M, exception: Throwable) {
        log(
            throwable = exception,
            tag = tag
        ) {
            " --->  FATAL ERROR: exception during initialization from model '$model'"
        }
    }

    override fun beforeUpdate(model: M, event: E) {
        log(tag = tag) { " --->  Event received: $event" }
    }

    override fun afterUpdate(model: M, event: E, result: Next<M, F>) {
        if (result.hasModel()) {
            log(tag = tag) { "  --->  " + "Model updated: " + result.modelUnsafe() }
        }
        for (effect in result.effects()) {
            log(tag = tag) { "--->  Effect dispatched: $effect" }
        }
    }

    override fun exceptionDuringUpdate(model: M, event: E, exception: Throwable) {
        log(
            throwable = exception,
            tag = tag
        ) { "--->  FATAL ERROR: exception updating model $model with event $event" }
    }

    companion object {
        fun <M, E, F> tag(tag: String?): OrezMobiusLogger<M, E, F> {
            return OrezMobiusLogger(tag)
        }
    }

}

