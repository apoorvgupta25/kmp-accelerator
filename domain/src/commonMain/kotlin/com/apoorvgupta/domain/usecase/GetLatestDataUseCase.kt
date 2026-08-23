package com.apoorvgupta.domain.usecase

import com.apoorvgupta.core.model.DataError
import com.apoorvgupta.core.model.Result
import com.apoorvgupta.domain.model.Data

/**
 * Get latest data use case
 *
 * @constructor Create empty Get latest data use case
 *
 * @author Apoorv Gupta
 */
fun interface GetLatestDataUseCase {
    suspend operator fun invoke(): Result<Data?, DataError.Remote>
}
