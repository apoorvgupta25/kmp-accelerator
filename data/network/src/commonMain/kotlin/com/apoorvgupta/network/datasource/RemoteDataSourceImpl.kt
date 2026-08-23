package com.apoorvgupta.network.datasource

import com.apoorvgupta.core.interactions.buildConfigProvider.BuildConfigContract
import com.apoorvgupta.core.model.DataError
import com.apoorvgupta.core.model.Result
import com.apoorvgupta.network.dto.DataDto
import com.apoorvgupta.network.helper.safeCall
import io.ktor.client.HttpClient
import io.ktor.client.request.get

/**
 * @author Apoorv Gupta
 */
class RemoteDataSourceImpl(
    private val httpClient: HttpClient,
    private val buildConfigContract: BuildConfigContract,
) : RemoteDataSource {
    /**
     * Returns the data
     * Suspending function — must be called from a coroutine or another suspending function.
     *
     * @return the result
     */
    override suspend fun getData(): Result<DataDto, DataError.Remote> = safeCall<DataDto> {
        httpClient.get(
            urlString = appendBaseUrl("products"),
        )
    }

    private fun appendBaseUrl(endpoint: String) = buildConfigContract.getBaseUrl() + "/$endpoint"
}
