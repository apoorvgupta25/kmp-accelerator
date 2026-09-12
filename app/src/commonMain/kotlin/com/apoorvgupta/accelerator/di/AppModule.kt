package com.apoorvgupta.accelerator.di

import com.apoorvgupta.accelerator.AppViewModel
import com.apoorvgupta.accelerator.BuildConfigContractImpl
import com.apoorvgupta.core.interactions.buildConfigProvider.BuildConfigContract
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * @author Apoorv Gupta
 */
val appModule = module {
    singleOf(::BuildConfigContractImpl).bind<BuildConfigContract>()
    viewModelOf(::AppViewModel)
}
