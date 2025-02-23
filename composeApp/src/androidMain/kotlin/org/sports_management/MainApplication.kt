package org.sports_management

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.sports_management.dep_inject.commonModule
import org.sports_management.dep_inject.getViewModelModule
import org.sports_management.dep_inject.platformModule

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(commonModule, platformModule, getViewModelModule())
        }
    }
}