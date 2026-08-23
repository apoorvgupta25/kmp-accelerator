package com.apoorvgupta.home.model

import com.apoorvgupta.core.model.DataStatus
import com.apoorvgupta.core.model.ErrorModel
import com.apoorvgupta.core.utils.emptyValue
import com.apoorvgupta.domain.model.AppThemeOptions
import com.apoorvgupta.domain.model.Data

/**
 * Data class representing data model required for Home Screen
 *
 * @property status The [DataStatus] representing the current status of the Search Landing screen data.
 * @property label
 * @constructor Create empty Home data model
 *
 * @author Apoorv Gupta
 */
data class HomeDataModel(
    val status: DataStatus = DataStatus.Empty,
    val errorModel: ErrorModel = ErrorModel(),
    val homeContent: HomeContent = HomeContent(),
    val currentTheme: AppThemeOptions = AppThemeOptions.SYSTEM,
    val data: Data = Data.emptyValue,
)

data class HomeContent(
    val headingText: String = String.emptyValue(),
    val subHeadingText: String = String.emptyValue(),
)
