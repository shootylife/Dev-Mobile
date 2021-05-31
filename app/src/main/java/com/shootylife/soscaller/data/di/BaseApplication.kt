package com.shootylife.soscaller.data.di

import android.app.Application
import com.shootylife.soscaller.data.di.module.LocationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(
                listOf(
                    LocationModule.locationModule,
                    LocationModule.homeViewModel
                )
            )
            koin.createRootScope()
        }

    }
}