package com.abhijith.magictheme

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.abhijith.magictheme.helper.currentTheme

class MainActivity : ThemeActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTheme()
        findViewById<Button>(R.id.btnSwitchTheme).apply {
            setOnClickListener {
                switchTheme()
//                recreate()
            }
        }
    }
}