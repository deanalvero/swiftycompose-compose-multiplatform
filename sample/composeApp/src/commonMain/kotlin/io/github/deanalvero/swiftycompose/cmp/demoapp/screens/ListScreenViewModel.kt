package io.github.deanalvero.swiftycompose.cmp.demoapp.screens

import androidx.lifecycle.ViewModel
import io.github.deanalvero.swiftycompose.cmp.demoapp.data.ComponentRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListScreenViewModel : ViewModel() {
    private val repository = ComponentRepository
    private val _uiState = MutableStateFlow<ListScreenUiState>(ListScreenUiState.Loading)

    val uiState = _uiState.asStateFlow()

    init {
        _uiState.value = ListScreenUiState.Loaded(
            items = repository.samples()
        )
    }
}
