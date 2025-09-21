package edu.pe.cibertec

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.pe.cibertec.screens.HomeScreen
import edu.pe.cibertec.screens.NewNoteSreen

@Composable
fun AppNav(){
    val navController = rememberNavController()

    NavHost (navController, startDestination = "home") {
        composable ("home") {
            HomeScreen(onNavigateTONew = { navController.navigate("new")} )
        }
        composable("new") {
                NewNoteSreen( {  navController.popBackStack() })
        }
        composable("detail/") {

        }
    }

}