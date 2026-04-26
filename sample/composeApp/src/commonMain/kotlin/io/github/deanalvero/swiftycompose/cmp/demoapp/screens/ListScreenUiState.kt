package io.github.deanalvero.swiftycompose.cmp.demoapp.screens

import io.github.deanalvero.swiftycompose.cmp.demoapp.data.ComponentData

sealed class ListScreenUiState {
    data object Loading : ListScreenUiState()
    data class Loaded(
        val items: List<ComponentData>
    ) : ListScreenUiState()
}
