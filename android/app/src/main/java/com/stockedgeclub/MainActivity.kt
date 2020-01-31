package com.stockedgeclub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kredent.liquidswipe.LiquidPager
import android.content.Intent
import android.os.Build
import android.net.Uri
import android.provider.Settings
import android.view.View
import com.facebook.soloader.SoLoader


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SoLoader.init(this,false)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                val intent = Intent(
                    Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:$packageName")
                )
                startActivityForResult(intent, 1)
            }
        }
        setContentView(R.layout.activity_main)

        val pager = findViewById<LiquidPager>(R.id.pager)
        pager.adapter = Adapter(supportFragmentManager)
    }

    fun goToReactNative() {
        val i = Intent(applicationContext, MainApplication::class.java)
        startActivity(i)
    }

    fun onSkipButtonClick (view: View){
        this.goToReactNative();
    }
}
