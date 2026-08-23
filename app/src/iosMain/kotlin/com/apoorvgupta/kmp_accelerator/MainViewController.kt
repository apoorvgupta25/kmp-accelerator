package com.apoorvgupta.kmp_accelerator

import androidx.compose.ui.window.ComposeUIViewController
import com.apoorvgupta.core.logger.AppLogger
import com.apoorvgupta.kmp_accelerator.di.initKoin

/**
 * @author Apoorv Gupta
 */
@Suppress("FunctionName")
fun MainViewController() = ComposeUIViewController(
    configure = {
        AppLogger.enableLogging()

        initKoin()
    },
) {
    App()
}
