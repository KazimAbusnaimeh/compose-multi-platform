package org.example.composemp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.composemp.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ComposeMP",
        ) {
            App()
        }
    }
}