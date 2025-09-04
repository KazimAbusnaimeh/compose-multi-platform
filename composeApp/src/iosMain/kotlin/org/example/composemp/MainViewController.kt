package org.example.composemp

import androidx.compose.ui.window.ComposeUIViewController
import org.example.composemp.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}