package com.example.praktikum6 // <-- SUDAH DISESUAIKAN

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum6.view.FormulirScreen // <-- SUDAH DISESUAIKAN
import com.example.praktikum6.view.ListPesertaScreen // <-- SUDAH DISESUAIKAN
import com.example.praktikum6.view.WelcomeScreen // <-- SUDAH DISESUAIKAN

enum class Navigasi {
    Welcome,
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    val viewModel: DataViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Navigasi.Welcome.name
    ) {
        composable(route = Navigasi.Welcome.name) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Navigasi.Formulirku.name) {
            FormulirScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = Navigasi.Detail.name) {
            ListPesertaScreen(navController = navController, viewModel = viewModel)
        }
    }
}