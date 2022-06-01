package com.zat.vib.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zat.vib.R
import com.zat.vib.base.BaseActivity
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        MainScope().launch {
            delay(2000)
            startActivity(Intent(this@SplashActivity,BoardingActivity::class.java))
            finish()
        }
    }

    override fun attachViewMode() {

    }
}