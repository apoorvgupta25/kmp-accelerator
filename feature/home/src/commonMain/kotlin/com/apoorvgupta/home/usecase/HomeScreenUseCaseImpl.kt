package com.apoorvgupta.home.usecase

import com.apoorvgupta.core.model.DataStatus
import com.apoorvgupta.core.model.ErrorModel
import com.apoorvgupta.core.model.onError
import com.apoorvgupta.core.model.onSuccess
import com.apoorvgupta.core.utils.getValueOrEmpty
import com.apoorvgupta.domain.model.AppThemeOptions
import com.apoorvgupta.domain.model.Data
import com.apoorvgupta.domain.usecase.GetLatestDataUseCase
import com.apoorvgupta.domain.usecase.datastore.LoadAppThemeUseCase
import com.apoorvgupta.home.model.HomeContent
import com.apoorvgupta.home.model.HomeDataModel
import kotlinx.coroutines.flow.first

/**
 * @author Apoorv Gupta
 */
class HomeScreenUseCaseImpl(
    private val getLatestDataUseCase: GetLatestDataUseCase,
    private val loadAppThemeUseCase: LoadAppThemeUseCase,
) : HomeScreenUseCase {

    var homeDataModel = HomeDataModel()

    override suspend fun getHomeScreenContentData(): HomeDataModel {
        getLatestDataUseCase()
            .onSuccess { data ->
                homeDataModel =
                    getHomeData(data, loadAppThemeUseCase().first())
            }
            .onError { err, code ->
                homeDataModel = emitHomeError(
                    statusCode = code.getValueOrEmpty(),
                    message = err.name.getValueOrEmpty(),
                )
            }

        return homeDataModel
    }

    private fun getHomeData(
        data: Data?,
        currentTheme: AppThemeOptions,
    ): HomeDataModel = HomeDataModel(
        status = DataStatus.Success,
        homeContent = HomeContent(
            headingText = "Heading",
            subHeadingText = "Subheading",
        ),
        currentTheme = currentTheme,
        data = data ?: Data.emptyValue,
    )

    private fun emitHomeError(
        statusCode: Int,
        message: String = "",
    ) = HomeDataModel(
        status = DataStatus.Error,
        errorModel = ErrorModel(
            errorCode = statusCode,
            message = message,
        ),
    )
}
