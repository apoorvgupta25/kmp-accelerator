package com.apoorvgupta.network.di

import com.apoorvgupta.domain.repo.DataRepo
import com.apoorvgupta.domain.usecase.GetLatestDataUseCase
import com.apoorvgupta.network.datasource.HttpClientFactory
import com.apoorvgupta.network.datasource.RemoteDataSource
import com.apoorvgupta.network.datasource.RemoteDataSourceImpl
import com.apoorvgupta.network.repo.DataRepoImpl
import com.apoorvgupta.network.usecase.GetLatestDataUseCaseImpl
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * @author Apoorv Gupta
 */
val networkModule = module {
    single { HttpClientFactory.create(get()) }

    singleOf(::RemoteDataSourceImpl).bind<RemoteDataSource>()
    singleOf(::DataRepoImpl).bind<DataRepo>()

    singleOf(::GetLatestDataUseCaseImpl).bind<GetLatestDataUseCase>()

    includes(platformModule)
}

internal expect val platformModule: Module
