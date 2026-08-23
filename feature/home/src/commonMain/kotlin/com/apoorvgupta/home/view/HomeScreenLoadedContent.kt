package com.apoorvgupta.home.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import com.apoorvgupta.designsystem.reusableComponents.pulltorefresh.AppPullToRefresh
import com.apoorvgupta.designsystem.theme.Dimensions
import com.apoorvgupta.home.intent.HomeIntent
import com.apoorvgupta.home.intent.HomeViewStates
import com.apoorvgupta.home.view.elements.HomeHeaderSection

/**
 * @author Apoorv Gupta
 */
@Composable
fun HomeScreenLoadedContent(
    state: HomeViewStates.LoadedData,
    userIntent: (HomeIntent) -> Unit,
) {
    AppPullToRefresh(
        isRefreshing = state.showLoader,
        onRefresh = { userIntent.invoke(HomeIntent.LoadHomeScreen) },
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = Dimensions.HorizonalDimensions.m_horizontal_spacing,
                    end = Dimensions.HorizonalDimensions.m_horizontal_spacing,
                    top = Dimensions.VerticalDimensions.m_vertical_spacing,
                ),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
        ) {
            item {
                HomeHeaderSection(
                    state = state,
                    userIntent = userIntent,
                )
            }

            item {
                Text(
                    text = state.data.data.total.toString(),
                    style = MaterialTheme.typography.titleMedium,
                )

                Text(
                    text = state.data.data.limit.toString(),
                    modifier = Modifier.padding(top = Dimensions.VerticalDimensions.s_vertical_spacing),
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}
