package com.example.razopayimplementaion.naviagtion

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.razopayimplementaion.Paynow


fun NavGraphBuilder.mainNavGraph(navController: NavController) {
    composable("paynow") {
        Paynow()
    }
}
