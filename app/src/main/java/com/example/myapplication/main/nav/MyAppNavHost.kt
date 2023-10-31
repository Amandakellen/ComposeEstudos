package com.example.myapplication.main.nav
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.login.LoginScreen
import com.example.myapplication.main.view.MainScreen
import com.example.myapplication.main.view.states.MainStates

@Composable
fun MyAppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "destination_home"
    ) {
        composable("destination_home") {
            MainScreen(state = MainStates.Disabled(false),
                       onAction = {},
                       navController = navController)
        }
        composable("destination_login") {

            LoginScreen("teste")
        }

    }
}
