package com.tech.intenttest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//implicit intent
       btn_dail.setOnClickListener {
           //this code will be executed after clicking on dial button
           var intent= Intent()
           intent.action=Intent.ACTION_DIAL
           var mobile_number=et_mobile_number.text.toString()//
           intent.data= Uri.parse("tel:${mobile_number}")
           startActivity(intent)
       }

        //excplicit intent.
        btn_gmail.setOnClickListener {
            //this code will be executed after clicking on gmail button

            var intent=packageManager.getLaunchIntentForPackage("com.google.android.gm")
            startActivity(intent)
        }

        //Excplicit intent.
        btn_welcome_activity.setOnClickListener {
            //this code will be executed after clicking on welcome button

            var intent=Intent(this,WelcomeActivity::class.java)
            var message=et_message.text.toString()
            intent.putExtra("message",message)//we are passing data from one activity to anather activity
            startActivity(intent)
        }
    }
}