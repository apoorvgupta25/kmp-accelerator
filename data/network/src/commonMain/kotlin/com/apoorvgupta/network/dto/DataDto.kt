package com.apoorvgupta.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author Apoorv Gupta
 */
@Serializable
data class DataDto(
    @SerialName("total")
    val total: Int,

    @SerialName("skip")
    val skip: Int,

    @SerialName("limit")
    val limit: Int,

)
