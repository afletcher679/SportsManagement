package org.sports_management

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.sports_management.dep_inject.initKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val koinApp = initKoin().koin
    val greetingViewModel = koinApp.get<GreetingViewModel>()
    ComposeViewport(document.body!!) {
        App(greetingViewModel)
    }
}