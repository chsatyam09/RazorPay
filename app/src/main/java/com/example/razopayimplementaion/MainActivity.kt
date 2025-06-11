package com.example.razopayimplementaion

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.razopayimplementaion.naviagtion.mainNavGraph
import com.razorpay.PaymentData
import com.razorpay.PaymentResultListener
import com.razorpay.PaymentResultWithDataListener

class MainActivity : ComponentActivity(), PaymentResultListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "paynow") {
                mainNavGraph(navController)
            }
        }
    }

    override fun onPaymentSuccess(razorpayPaymentID: String?) {
        Toast.makeText(this, "Payment Successful: $razorpayPaymentID", Toast.LENGTH_SHORT).show()
    }

    override fun onPaymentError(code: Int, description: String?) {
        Toast.makeText(this, "Payment failed: $description", Toast.LENGTH_SHORT).show()
    }

}


//class MainActivity : ComponentActivity(), PaymentResultWithDataListener {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//            RazorpayPaymentScreen { apiKey, customOptions ->
//                startPayment(this, apiKey, customOptions)
//            }
//        }
//    }
//
//    override fun onPaymentSuccess(razorpayPaymentId: String?, paymentData: PaymentData?) {
//        AlertDialog.Builder(this)
//            .setTitle("Payment Success")
//            .setMessage("Payment ID: $razorpayPaymentId\nData: ${paymentData?.data}")
//            .setPositiveButton("OK", null)
//            .show()
//    }
//
//    override fun onPaymentError(code: Int, description: String?, paymentData: PaymentData?) {
//        AlertDialog.Builder(this)
//            .setTitle("Payment Failed")
//            .setMessage("Reason: $description\nData: ${paymentData?.data}")
//            .setPositiveButton("OK", null)
//            .show()
//    }
//}

