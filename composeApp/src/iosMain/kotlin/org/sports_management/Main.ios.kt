package org.sports_management

import androidx.compose.ui.window.ComposeUIViewController
import org.sports_management.dep_inject.ProvideViewModel

fun ComposeEntryPointWithUIViewController()  = ComposeUIViewController { App(ProvideViewModel.getGreetingViewModel()) }