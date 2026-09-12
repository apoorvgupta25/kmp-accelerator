package com.apoorvgupta.accelerator.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.apoorvgupta.designsystem.navigation.Destinations
import com.apoorvgupta.home.navigation.HomeScreenDestination
import com.apoorvgupta.home.viewmodel.HomeViewModel
import org.koin.compose.viewmodel.koinViewModel

/**
 * Defines the navigation graph for the Home screen.
 * @author Apoorv Gupta
 */
fun NavGraphBuilder.homeNavigationGraph(
    navController: NavHostController,
) {
    composable<Destinations.Home> {
        val viewModel: HomeViewModel = koinViewModel()
        val viewState by viewModel.viewState.collectAsState()
        val effect = viewModel.effect

        HomeScreenDestination(
            homeViewModel = viewModel,
            homeViewState = viewState.homeViewState,
            navEffect = effect,
            navController = navController,
        )
    }
}

fun NavGraphBuilder.bookmarkNavigationGraph() {
    composable<Destinations.Bookmark> {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Text("BookMark")
        }
    }
}
