package com.example.admob.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.main.MainActivity
import com.example.admob.R
import com.vapp.admoblibrary.AdmodUtils

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        AdmodUtils.fetchAppOpenAds(this, MainActivity::class.java,"ca-app-pub-3940256099942544/3419835294")
        AdmodUtils.limitTime=300000
    }
}