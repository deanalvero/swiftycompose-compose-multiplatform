package io.github.deanalvero.swiftycompose.cmp.demoapp.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.deanalvero.swiftycompose.cmp.background
import io.github.deanalvero.swiftycompose.cmp.components.Button
import io.github.deanalvero.swiftycompose.cmp.components.HStack
import io.github.deanalvero.swiftycompose.cmp.components.Spacer
import io.github.deanalvero.swiftycompose.cmp.components.Text
import io.github.deanalvero.swiftycompose.cmp.components.Toggle
import io.github.deanalvero.swiftycompose.cmp.components.VStack
import io.github.deanalvero.swiftycompose.cmp.components.ZStack
import io.github.deanalvero.swiftycompose.cmp.data.stateBinding
import io.github.deanalvero.swiftycompose.cmp.frame
import io.github.deanalvero.swiftycompose.cmp.padding

object ComponentRepository {
    val all = listOf(
        ComponentData(
            name = "VStack",
            codeSnippet = """
                !VStack {
                    +Text("One")
                    +Text("Two")
                    +Text("Three")
                }
            """.trimIndent(),
            content = {
                !VStack {
                    +Text("One")
                    +Text("Two")
                    +Text("Three")
                }
            }
        ),
        ComponentData(
            name = "HStack",
            codeSnippet = """
                !HStack {
                    +Text("Left")
                    +Spacer()
                    +Text("Right")
                }.padding(16.dp)
            """.trimIndent(),
            content = {
                !HStack {
                    +Text("Left")
                    +Spacer()
                    +Text("Right")
                }.padding(16.dp)
            }
        ),
        ComponentData(
            name = "ZStack",
            codeSnippet = """
                !ZStack {
                    +Text("Background")
                        .frame(width = 100.dp, height = 100.dp)
                        .background(Color.Red)
                    +Text("Foreground")
                        .foregroundStyle(Color.White)
                }
            """.trimIndent(),
            content = {
                !ZStack {
                    +Text("Background")
                        .frame(width = 100.dp, height = 100.dp)
                        .background(Color.Red)
                    +Text("Foreground")
                        .foregroundStyle(Color.White)
                }
            }
        ),
        ComponentData(
            name = "Toggle",
            codeSnippet = """
                var isOn = stateBinding(true)
                !VStack {
                    !Text("State: ${'$'}{isOn.value}")
                    Toggle(isOn = isOn)()
                }
            """.trimIndent(),
            content = {
                var isOn = stateBinding(true)
                !VStack {
                    !Text("State: ${isOn.value}")
                    Toggle(isOn = isOn)()
                }
            }
        ),
        ComponentData(
            name = "Button",
            codeSnippet = """
                !Button(
                    "Submit",
                    action = {}
                )
            """.trimIndent(),
            content = {
                !Button(
                    "Submit",
                    action = {}
                )
            }
        )
    )

    fun getByName(name: String): ComponentData? = all.find { it.name == name }
}
