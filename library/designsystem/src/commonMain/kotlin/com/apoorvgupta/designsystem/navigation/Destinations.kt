package com.apoorvgupta.designsystem.navigation

import kotlinx.serialization.Serializable

/**
 * Sealed interface representing different destinations in the app.
 *
 * @author Apoorv Gupta
 */
sealed interface Destinations {

    @Serializable
    data object AppGraph : Destinations

    // Home Destination
    @Serializable
    object Home : Destinations

    // Bookmark Destination
    @Serializable
    object Bookmark : Destinations
}
