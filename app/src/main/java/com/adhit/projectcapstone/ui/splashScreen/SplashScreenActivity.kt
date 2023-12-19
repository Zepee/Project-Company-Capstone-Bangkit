package com.adhit.projectcapstone.ui.splashScreen

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.adhit.projectcapstone.MainActivity
import com.adhit.projectcapstone.R

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        val imageView = findViewById<ImageView>(R.id.logo)

        val fadeIn = ObjectAnimator.ofFloat(imageView, "alpha", 0f, 1f)
        fadeIn.duration = 2000
        fadeIn.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_TIME)

    }
    companion object {
        const val DELAY_TIME = 3000L
    }

}