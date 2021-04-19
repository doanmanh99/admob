package com.example.admob.main2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.R
import com.example.admob.main.MainActivity
import com.vapp.admoblibrary.AdmodUtils
import com.vapp.admoblibrary.nativetemplate.TemplateView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        AdmodUtils.loadAdNativeAds(this,AdmodUtils.ads_admob_native_test_id,my_template)
        btn.setOnClickListener {
            AdmodUtils.loadAndShowAdReward(this,AdmodUtils.ads_admob_rewarded_test_id)
        }
    }
}