package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class showOrders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_orders)
        supportActionBar?.hide()

        val order = findViewById<TextView>(R.id.tVOrder)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        order.text = "Your orders are - "+ ordersOfCustomer.toString()
    }
}