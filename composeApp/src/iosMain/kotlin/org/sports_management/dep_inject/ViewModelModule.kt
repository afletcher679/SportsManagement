package org.sports_management.dep_inject

import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.module.Module
import org.koin.dsl.module
import org.sports_management.GreetingViewModel


private val viewModelModules = module {
   single { GreetingViewModel(get()) }
}

actual fun getViewModelModule(): Module = viewModelModules


object ProvideViewModel : KoinComponent{
    fun getGreetingViewModel() : GreetingViewModel = get()
}