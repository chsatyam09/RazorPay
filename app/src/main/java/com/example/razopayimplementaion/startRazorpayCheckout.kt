package com.example.razopayimplementaion

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.razorpay.Checkout
import org.json.JSONObject

fun startRazorpayCheckout(context: Context) {
    val checkout = Checkout()
    checkout.setKeyID("rzp_test_jHQUbmwIVhC9ii")

    try {
        val activity = context as Activity

        val options = JSONObject()
        options.put("name", "Your Company Name")
        options.put("description", "Test Payment")
        options.put("currency", "INR")
        options.put("amount", "10000")

        val prefill = JSONObject()
        prefill.put("email", "test@example.com")
        prefill.put("contact", "9876543210")
        options.put("prefill", prefill)

        checkout.open(context, options)
    } catch (e: Exception) {
        Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_LONG).show()
    }
}
