package org.sports_management.dep_inject

import org.koin.dsl.module
import org.sports_management.Greeting
import org.sports_management.Platform

val commonModule = module {
    factory { Platform() }
    factory { Greeting(get()) }
}