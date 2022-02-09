package com.example.newbasicstructure.ui.activity

import android.content.Intent
import android.os.Bundle
import com.example.newbasicstructure.core.uI.BaseActivity

class IntroActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        intent = Intent(
            this,
            SplashActivity::class.java
        ).apply {
            intent.extras?.let { putExtras(it) }
        }
        startActivity(intent)
        finish()
    }
}
