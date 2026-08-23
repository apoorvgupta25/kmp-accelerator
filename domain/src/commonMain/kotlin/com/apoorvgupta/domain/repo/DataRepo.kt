package com.apoorvgupta.domain.repo

import com.apoorvgupta.core.model.DataError
import com.apoorvgupta.core.model.Result
import com.apoorvgupta.domain.model.Data

/**
 * @author Apoorv Gupta
 */
interface DataRepo {

    suspend fun getLatestData(): Result<Data?, DataError.Remote>
}
