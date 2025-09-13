package org.example.composemp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.example.composemp.dependencies.MyViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App(onBockClicked: () -> Unit = {}) {
    MaterialTheme {
        val nav = rememberNavController()
        KoinContext {
            NavHost(navController = nav, startDestination = "home") {
                composable("home") {
                    val viewModel = koinViewModel<MyViewModel>()
                    Box(Modifier.fillMaxSize().clickable {
                        onBockClicked()
                    }, contentAlignment = Alignment.Center) {
                        Text(viewModel.getHelloWorldString())
                    }
                }
            }
        }
    }
}
