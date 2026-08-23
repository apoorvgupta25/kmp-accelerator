package com.apoorvgupta.kmp_accelerator

import androidx.lifecycle.ViewModel
import com.apoorvgupta.domain.model.AppThemeOptions
import com.apoorvgupta.domain.usecase.datastore.LoadAppThemeUseCase
import kotlinx.coroutines.flow.Flow

/**
 * App view model
 * Android [ViewModel] — survives configuration changes and exposes observable UI state.
 *
 * @constructor Creates a new AppViewModel
 * @property loadAppThemeUsecase the load app theme usecase
 *
 * @author Apoorv Gupta
 */
internal class AppViewModel(
    private val loadAppThemeUsecase: LoadAppThemeUseCase,
) : ViewModel() {

    fun loadCurrentTheme(): Flow<AppThemeOptions> = loadAppThemeUsecase()
}
