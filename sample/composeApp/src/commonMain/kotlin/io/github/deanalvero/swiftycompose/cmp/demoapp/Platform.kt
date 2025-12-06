package io.github.deanalvero.swiftycompose.cmp.demoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform