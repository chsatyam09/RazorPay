package com.example.razopayimplementaion

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun Paynow() {
    val context = LocalContext.current

    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray)) {

        Box(modifier = Modifier.height(15.dp).fillMaxWidth(), contentAlignment = Alignment.Center
        ) {

            Button(onClick = {
                startRazorpayCheckout(context)
            }) {
                Text(text = "Pay with RazorPay")
            }

        }


    }
}


