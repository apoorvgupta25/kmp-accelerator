package com.apoorvgupta.kmp_accelerator

import android.app.Application
import com.apoorvgupta.core.logger.AppLogger
import com.apoorvgupta.kmp_accelerator.di.initKoin
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
