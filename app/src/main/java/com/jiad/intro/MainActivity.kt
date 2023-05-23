package com.jiad.intro

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import java.time.format.SignStyle

class MainActivity : AppCompatActivity() {
    lateinit var Buttonlogin: Button
    lateinit var Buttonsign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttonlogin = findViewById(R.id.login)
        Buttonsign=findViewById(R.id.sign)

        Buttonlogin.setOnClickListener {
            val intent = Intent(this, appsactivity::class.java)
            startActivity(intent)
        }
        Buttonsign.setOnClickListener {
            val intent=Intent(this,newactivity::class.java)
            startActivity(intent)
        }
    }
}
//class MainActivity : AppCompatActivity(){
//    lateinit var Buttonsign:SignStyle
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//        setContentView(R.layout.activity_main)
//        Buttonsign=findViewById(R.id.sign)
//        Buttonsign.set
//    }
//}