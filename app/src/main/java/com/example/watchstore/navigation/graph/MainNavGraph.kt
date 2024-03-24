package com.example.watchstore.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.watchstore.presentation.screen.cart.CartScreen
import com.example.watchstore.presentation.screen.detail.DetailScreen
import com.example.watchstore.presentation.screen.home.HomeScreen
import com.example.watchstore.presentation.screen.search.SearchScreen
import com.example.watchstore.utils.Constants.PRODUCT_ARGUMENT_KEY
import com.google.accompanist.pager.ExperimentalPagerApi
import com.example.watchstore.navigation.screen.BottomNavItemScreen
import com.example.watchstore.navigation.screen.Screen

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.MAIN,
        startDestination = BottomNavItemScreen.Home.route
    ) {
        composable(route = BottomNavItemScreen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(route = BottomNavItemScreen.Cart.route) {
            CartScreen()
        }

        searchNavGraph()

        detailsNavGraph()
    }
}

fun NavGraphBuilder.detailsNavGraph() {
    navigation(
        route = Graph.DETAILS,
        startDestination = Screen.Details.route
    ) {
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(PRODUCT_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {
            DetailScreen()
        }
    }
}

fun NavGraphBuilder.searchNavGraph() {
    navigation(
        route = Graph.SEARCH,
        startDestination = Screen.Search.route
    ) {
        composable(route = Screen.Search.route) {
            SearchScreen()
        }
    }
}