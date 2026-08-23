package com.apoorvgupta.kmp_accelerator

import com.apoorvgupta.core.interactions.buildConfigProvider.BuildConfigContract

/**
 * Creates a new config contract impl
 *
 * @constructor Creates a new BuildConfigContractImpl
 *
 * @author Apoorv Gupta
 */
class BuildConfigContractImpl : BuildConfigContract {

    /**
     * Retrieves the base URL for network requests.
     */
    override fun getBaseUrl(): String = "https://dummyjson.com"

    /**
     * Retrieves the version name of the application.
     */
    override fun getAppVersion(): String = "VERSION_NAME"

    /**
     * Retrieves the application ID.
     */
    override fun getApplicationId(): String = "BuildConfig.APPLICATION_ID"
}
