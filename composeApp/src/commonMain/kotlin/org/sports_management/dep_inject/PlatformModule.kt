package org.sports_management.dep_inject

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.sports_management.Platform

val platformModule = module {
    singleOf(::Platform)
}