package com.apoorvgupta.network.datasource

import com.apoorvgupta.core.model.DataError
import com.apoorvgupta.core.model.Result
import com.apoorvgupta.network.dto.DataDto

/**
 * @author Apoorv Gupta
 */
interface RemoteDataSource {

    suspend fun getData(): Result<DataDto, DataError.Remote>
}
