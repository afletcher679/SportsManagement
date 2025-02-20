package org.sports_management.dep_inject

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val androidModule = module {
    singleOf(::GreetPresenter)
}