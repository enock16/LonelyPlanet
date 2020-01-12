package com.example.lonelyplanet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        // add the Handler //
        Handler().postDelayed({
            // add startActivity start with current Act ,then next //
            startActivity(Intent(this@SplashScreen,MainActivity::class.java))

            finish()
            // time delays//
        },4000)

    }
}
