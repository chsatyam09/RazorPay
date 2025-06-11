package com.example.razopayimplementaion.naviagtion

import android.app.Activity
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.razopayimplementaion.Paynow


fun NavGraphBuilder.mainNavGraph(navController: NavController) {
    composable("paynow") {
        Paynow()
    }
}

//fun NavGraphBuilder.mainNavGraph(navController: NavController) {
//    composable("paynow") {
//        val context = LocalContext.current
//        RazorpayPaymentScreen { apiKey, customOptions ->
//            startPayment(context as Activity, apiKey, customOptions)
//        }
//    }
//}
