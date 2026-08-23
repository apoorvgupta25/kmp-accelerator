package com.apoorvgupta.network.usecase

import com.apoorvgupta.domain.repo.DataRepo
import com.apoorvgupta.domain.usecase.GetLatestDataUseCase

/**
 * Get latest data use case impl
 *
 * @property dataRepo
 * @constructor Create empty Get latest data use case impl
 *
 * @author Apoorv Gupta
 */
class GetLatestDataUseCaseImpl(
    private val dataRepo: DataRepo,
) : GetLatestDataUseCase {

    /**
     * Get latest data
     *
     * @return
     */
    override suspend operator fun invoke() = dataRepo.getLatestData()
}
