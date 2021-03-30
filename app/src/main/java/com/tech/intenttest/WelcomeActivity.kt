package com.tech.intenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var recieved_message=intent.getStringExtra("message")//got the String sent by mainactivity
        textView.setText("welcome here : ${recieved_message}")
    }
}