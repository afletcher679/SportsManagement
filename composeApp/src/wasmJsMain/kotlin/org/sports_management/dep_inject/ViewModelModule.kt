package org.sports_management.dep_inject

import org.koin.core.module.Module
import org.koin.dsl.module
import org.sports_management.GreetingViewModel

actual fun getViewModelModule(): Module = module {
    single { GreetingViewModel(get()) }
}