package com.iambedant.orez

import io.github.aakira.napier.log
import me.tatarka.inject.annotations.Inject

@Inject
class Greeting(private val testNetwork: TestNetwork) {

    fun greet(): String {

        log{" Calling Network"}
        testNetwork.callNetwork()
        log{" Returning Hello"}

        return "Hello!"
    }
}