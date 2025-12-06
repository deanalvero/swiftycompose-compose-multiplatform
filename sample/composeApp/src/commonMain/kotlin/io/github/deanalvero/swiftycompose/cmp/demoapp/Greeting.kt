package io.github.deanalvero.swiftycompose.cmp.demoapp

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}