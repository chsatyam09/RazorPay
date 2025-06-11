//package com.example.razopayimplementaion
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun RazorpayPaymentScreen(onStartPayment: (String, String) -> Unit) {
//    var apiKey by remember { mutableStateOf("") }
//    var customOptions by remember { mutableStateOf("") }
//
//    Column(modifier = Modifier.padding(16.dp)) {
//        OutlinedTextField(
//            value = apiKey,
//            onValueChange = { apiKey = it },
//            label = { Text("uo6HgL3eXeaDzupWmlJZka57") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = customOptions,
//            onValueChange = { customOptions = it },
//            label = { Text("Custom Options (JSON)") },
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Button(onClick = {
//            onStartPayment(apiKey, customOptions)
//        }, modifier = Modifier.fillMaxWidth()) {
//            Text("Start Payment")
//        }
//    }
//}
