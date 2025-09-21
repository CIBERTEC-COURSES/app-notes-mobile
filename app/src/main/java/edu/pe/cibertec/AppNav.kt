package edu.pe.cibertec

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNav(){
    val navController = rememberNavController()

    NavHost (navController, startDestination = "home") {
        composable ("home") {

        }
        composable("new") {

        }
        composable("detail/") {

        }
    }

}