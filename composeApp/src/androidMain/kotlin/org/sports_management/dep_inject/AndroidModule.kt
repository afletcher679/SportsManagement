package org.sports_management.dep_inject

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.sports_management.GreetingViewModel

val androidModule = module {
    viewModel{
        GreetingViewModel(get())
    }
}