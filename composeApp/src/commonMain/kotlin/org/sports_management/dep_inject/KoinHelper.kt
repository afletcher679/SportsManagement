package org.sports_management.dep_inject

import org.koin.core.context.startKoin


fun initKoin() = startKoin {
    modules(commonModule, platformModule, getViewModelModule())
}
