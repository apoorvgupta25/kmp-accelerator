package com.apoorvgupta.core.utils

/**
 * Date utils
 * Singleton object — a single shared instance.
 * Utility holder — stateless helper functions; not meant to be instantiated.
 *
 * @constructor Creates a new DateUtils
 *
 * @author Apoorv Gupta
 */
expect object DateUtils {

    /**
     * Get date formatted
     *
     * @param timestamp in format of "2025-03-23T00:00:00"
     * @param inputFormat Input Date Format
     * @param outputFormat Output Date Format
     * @return date in format of Mar 30, 2025
     */
    fun getDateFormatted(
        timestamp: String,
        inputFormat: String = DateFormatConst.API_DATE_FORMAT,
        outputFormat: String = DateFormatConst.DATE_FORMAT,
    ): String
}

object DateFormatConst {
    const val API_DATE_FORMAT: String = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    const val DATE_FORMAT: String = "MMM d, yyyy"
    const val API_TIME_FORMAT: String = "HH:mm:ss"
    const val HOUR_MIN_FORMAT: String = "hh:mm a"
}
