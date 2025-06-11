package com.example.razopayimplementaion

//import android.app.Activity
//import android.widget.Toast
//import com.razorpay.Checkout
//import org.json.JSONObject
//
//fun startPayment(activity: Activity, apiKey: String, customOptions: String) {
//    val co = Checkout()
//
//    if (apiKey.isNotEmpty()) {
//        co.setKeyID(apiKey)
//    }
//
//    try {
//        val options = if (customOptions.isNotEmpty()) {
//            JSONObject(customOptions)
//        } else {
//            JSONObject().apply {
//                put("name", "Razorpay Corp")
//                put("description", "Demoing Charges")
//                put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png")
//                put("currency", "INR")
//                put("amount", "100")
//                put("send_sms_hash", true)
//
//                val prefill = JSONObject()
//                prefill.put("email", "test@razorpay.com")
//                prefill.put("contact", "9021066696")
//                put("prefill", prefill)
//            }
//        }
//
//        co.open(activity, options)
//    } catch (e: Exception) {
//        Toast.makeText(activity, "Error in payment: ${e.message}", Toast.LENGTH_LONG).show()
//        e.printStackTrace()
//    }
//}
