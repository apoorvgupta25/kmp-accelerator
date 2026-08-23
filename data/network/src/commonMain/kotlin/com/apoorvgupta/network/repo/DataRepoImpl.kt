package com.apoorvgupta.network.repo

import com.apoorvgupta.core.model.map
import com.apoorvgupta.domain.repo.DataRepo
import com.apoorvgupta.network.datasource.RemoteDataSource
import com.apoorvgupta.network.mappers.toData

/**
 * @author Apoorv Gupta
 */
class DataRepoImpl(
    private val remoteDataSource: RemoteDataSource,
) : DataRepo {

    override suspend fun getLatestData() = remoteDataSource.getData()
        .map { dto ->
            dto.toData()
        }
}
