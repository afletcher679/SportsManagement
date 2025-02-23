package org.sports_management

import org.koin.core.context.startKoin
import org.sports_management.dep_inject.appModule

fun initKoin(){
    startKoin {
        modules(appModule())
    }
}