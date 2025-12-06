package io.github.deanalvero.swiftycompose.cmp.demoapp

import kotlinx.serialization.Serializable

@Serializable
object ListRoute

@Serializable
data class DetailRoute(val componentName: String)