package io.github.deanalvero.swiftycompose.cmp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import io.github.deanalvero.swiftycompose.cmp.SwiftUIView

class Spacer() : SwiftUIView() {
    @Composable
    override fun invoke() {
        Spacer(
            modifier = modifier
        )
    }
}
