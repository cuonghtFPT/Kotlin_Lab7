package cuonghtph34430.poly.kotlin_lab7.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cuonghtph34430.poly.kotlin_lab7.model.MainViewModel
import cuonghtph34430.poly.kotlin_lab7.model.ROUTE_SCREEN
import cuonghtph34430.poly.kotlin_lab7.screen.GetLayoutScreenOne
import cuonghtph34430.poly.kotlin_lab7.screen.GetLayoutScreenThree
import cuonghtph34430.poly.kotlin_lab7.screen.GetLayoutScreenTwo
import cuonghtph34430.poly.kotlin_lab7.screen.LoginScreen
import cuonghtph34430.poly.kotlin_lab7.screen.Movie


@Composable
fun GetLayoutScreenNavigation() {

    val navController = rememberNavController()
    val mainViewModel: MainViewModel = viewModel()
    val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())
    NavHost(navController = navController, startDestination = ROUTE_SCREEN.login.name) {
        composable(ROUTE_SCREEN.login.name) { LoginScreen(navController) }
        composable(ROUTE_SCREEN.movie.name) {
            Movie(
                moviesState.value,
                navController
            )
        }
        composable(ROUTE_SCREEN.screen1.name) { GetLayoutScreenOne(navController) }
        composable(ROUTE_SCREEN.screen2.name) { GetLayoutScreenTwo(navController) }
        composable(ROUTE_SCREEN.screen3.name) { GetLayoutScreenThree(navController) }
    }


}