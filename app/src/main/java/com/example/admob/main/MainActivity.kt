package com.example.admob.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.R
import com.example.admob.main2.Main2Activity
import com.vapp.admoblibrary.AdmodUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AdmodUtils.loadAdBanner(this,adView,AdmodUtils.ads_admob_banner_id)
        btn.setOnClickListener {
            AdmodUtils.loadAndShowInterstitialStartNewActivity(this,AdmodUtils.ads_admob_inter_test_id,Main2Activity::class.java)
        }
    }
}