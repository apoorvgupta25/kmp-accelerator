package com.apoorvgupta.designsystem.navigation.ui

import org.jetbrains.compose.resources.DrawableResource

/**
 * Bottom nav item
 * Data class — a value holder; `equals`, `hashCode`, `toString` and `copy` are generated.
 *
 * @constructor Creates a new BottomNavItem
 * @property displayBadge the display badge
 * @property navigationRoute the navigation route
 * @property position
 * @property title
 * @property visible
 * @property badgeCount the badge count
 * @property unselectedIcon the unselected icon
 * @property selectedIcon the selected icon
 *
 * @author Apoorv Gupta
 */
data class BottomNavItem(
    val displayBadge: Boolean,
    val navigationRoute: Any,
    val position: Int,
    val title: String,
    val visible: Boolean,
    var badgeCount: Int,
    val unselectedIcon: DrawableResource,
    val selectedIcon: DrawableResource,
)
