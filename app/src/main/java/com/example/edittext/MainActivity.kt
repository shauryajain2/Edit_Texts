package com.example.edittext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY = "com.example.edittext.MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.button1)
        val ed1 = findViewById<EditText>(R.id.ed1)
        val ed2 = findViewById<EditText>(R.id.ed2)
        val ed3 = findViewById<EditText>(R.id.ed3)
        val ed4 = findViewById<EditText>(R.id.ed4)

        button.setOnClickListener(){
            val ordersList = ed1.text.toString() + ", "+ ed2.text.toString() + ", " +
        ed3.text.toString() + ", "+ ed4.text.toString() + " "

        intent = Intent(this,showOrders::class.java)
        intent.putExtra(KEY,ordersList)
        startActivity(intent)
        }
    }
}