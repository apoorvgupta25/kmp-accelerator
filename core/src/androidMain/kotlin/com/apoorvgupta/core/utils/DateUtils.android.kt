package com.apoorvgupta.core.utils

import java.text.SimpleDateFormat
import java.util.Locale

/**
 * Date utils
 * Singleton object — a single shared instance.
 * Utility holder — stateless helper functions; not meant to be instantiated.
 *
 * @constructor Creates a new DateUtils
 *
 * @author Apoorv Gupta
 */
actual object DateUtils {
    actual fun getDateFormatted(
        timestamp: String,
        inputFormat: String,
        outputFormat: String,
    ): String {
        // input date format
        val simpleDateFormat = SimpleDateFormat(inputFormat, Locale.getDefault())

        return try {
            // parsing
            val newDate = simpleDateFormat.parse(timestamp)

            // output date format
            if (newDate != null) {
                SimpleDateFormat(outputFormat, Locale.getDefault()).format(newDate)
            } else {
                String.Companion.emptyValue()
            }
        } catch (e: Exception) {
            String.emptyValue()
        }
    }
}
