package com.apoorvgupta.network.mappers

import com.apoorvgupta.domain.model.Data
import com.apoorvgupta.network.dto.DataDto

/**
 * @author Apoorv Gupta
 */
fun DataDto.toData() = Data(
    total = total,
    skip = skip,
    limit = limit,
)
