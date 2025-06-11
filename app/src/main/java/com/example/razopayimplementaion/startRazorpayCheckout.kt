package com.example.razopayimplementaion

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.razorpay.Checkout
import org.json.JSONObject

fun startRazorpayCheckout(context: Context) {
    val checkout = Checkout() // is used to initialize the Razorpay Checkout object, which allows you to start the payment process in your Android app.
    checkout.setKeyID("rzp_test_jHQUbmwIVhC9ii") // ⚠️ Replace with your actual key in production

    try {
        val activity = context as Activity

        val options = JSONObject().apply {
            put("name", "Your Company Name")
            put("description", "Test Payment")
            put("currency", "INR")
            put("amount", "10000")


            put("method", JSONObject().apply {
                put("upi", true)
                put("qr", true)
//                put("card", true)
//                put("wallet", false)
            })

            // Prefill user info
// The prefill object in Razorpay Checkout is used to pre-fill the user's details (like email, contact number, and name)
// on the Razorpay payment screen, so the user doesn't have to type them manually.
            put("prefill", JSONObject().apply {
                put("email", "test@example.com")
                put("contact", "9876543210")
            })
        }

        checkout.open(activity, options)

    } catch (e: Exception) {
        e.printStackTrace()
        Toast.makeText(context, "Error in starting Razorpay Checkout: ${e.localizedMessage}", Toast.LENGTH_LONG).show()
    }
}

