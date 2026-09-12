package com.apoorvgupta.accelerator

import android.app.Application
import com.apoorvgupta.accelerator.di.initKoin
import com.apoorvgupta.core.logger.AppLogger
import org.koin.android.ext.koin.androidContext

/**
 * @author Apoorv Gupta
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        AppLogger.enableLogging()

        initKoin {
            androidContext(this@MyApplication)
        }
    }
}
