package com.zat.vib.views.activities

import android.content.Intent
import android.os.Bundle
import com.zat.vib.R
import com.zat.vib.base.BaseActivity
import com.zat.vib.utils.singleClick
import kotlinx.android.synthetic.main.activity_boarding.*

class BoardingActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding)

        btnProceed.singleClick {
            startActivity(Intent(this,AuthActivity::class.java))
            finish()
        }
    }

    override fun attachViewMode() {

    }
}