package com.apoorvgupta.accelerator

import androidx.compose.ui.window.ComposeUIViewController
import com.apoorvgupta.accelerator.di.initKoin
import com.apoorvgupta.core.logger.AppLogger

/**
 * @author Apoorv Gupta
 */
@Suppress("FunctionName", "FunctionNaming")
fun MainViewController() = ComposeUIViewController(
    configure = {
        AppLogger.enableLogging()

        initKoin()
    },
) {
    App()
}
