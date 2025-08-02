package com.erick

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.erick.databinding.ActivityMainBinding
import com.erick.loadingview.MainLoadingActivity

/**
 * 首页展示
 */
class MainActivity : AppCompatActivity() {
    var mBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding?.run {
            //ShadowLayout的使用
            ShadowLayoutShadow.setOnClickListener {
                startActivity(Intent(this@MainActivity, ShadowActivity::class.java))
            }

            ShadowLayoutShape.setOnClickListener {
                startActivity(Intent(this@MainActivity, ShapeActivity::class.java))
            }

            ShadowLayoutWiki.setOnClickListener {
                startActivity(Intent(this@MainActivity, WikiActivity::class.java))
            }

            //3.4.1 SmartLoadingView的使用
            smartFullscreenAuto.setOnClickListener {
                smartFullscreenAuto.startLoading()
                smartFullscreenAuto.finishLoadingWithFullScreen(this@MainActivity, MainLoadingActivity::class.java)
            }
        }
    }
}