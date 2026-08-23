package com.apoorvgupta.network.di

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Platform module
 *
 * @author Apoorv Gupta
 */
internal actual val platformModule: Module
    get() = module {
        single<HttpClientEngine> { Darwin.create() }
    }
