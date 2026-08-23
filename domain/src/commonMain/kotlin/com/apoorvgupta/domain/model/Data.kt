package com.apoorvgupta.domain.model

import com.apoorvgupta.core.utils.emptyValue

/**
 * @author Apoorv Gupta
 */
@Suppress("DataClassContainsFunctions")
data class Data(
    val total: Int,
    val skip: Int,
    val limit: Int,
) {
    companion object {
        val emptyValue: Data
            get() = Data(
                total = Int.emptyValue(),
                skip = Int.emptyValue(),
                limit = Int.emptyValue(),
            )
    }
}
