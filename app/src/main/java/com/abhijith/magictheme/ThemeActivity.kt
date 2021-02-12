package com.abhijith.magictheme

import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.abhijith.magictheme.helper.Theme
import com.abhijith.magictheme.helper.currentTheme
import com.abhijith.magictheme.helper.findTheme
import com.abhijith.magictheme.views.setColors
import com.google.android.material.bottomnavigation.BottomNavigationView


open class ThemeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
//        setTheme(currentTheme)
    }

    fun setTheme() {
        super.setTheme(currentTheme)

        val theme = findTheme(currentTheme)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(getColor(theme.mPrimaryColor)))
        if (Build.VERSION.SDK_INT >= 21) {
            val window: Window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.setStatusBarColor(this.resources.getColor(theme.mColorPrimaryVariant))
        }

        updateChildColors(theme,findViewById(R.id.root))
    }

    private fun updateChildColors(theme: Theme,viewGroup: ViewGroup) {
        viewGroup.apply {
            (0 until this.childCount).forEach {
                when (val view = getChildAt(it)) {
                    is AppCompatTextView -> {
                        view.setColors(
                            theme.mColorOnPrimary,
                            theme.mColorPrimaryVariant,
                            theme.mPrimaryColor
                        )
                    }
                    is AppCompatButton -> {
                        view.setColors(
                            theme.mColorOnPrimary,
                            theme.mColorPrimaryVariant,
                            theme.mPrimaryColor
                        )
                    }
                    is BottomNavigationView -> {
                        view.setColors(
                            theme.mColorOnPrimary,
                            theme.mPrimaryColor,
                            theme.mColorPrimaryVariant,
                        )
                    }
                    is ViewGroup->{
                        updateChildColors(theme, view)
                    }
                }
            }
        }
    }

    protected fun switchTheme() {
        currentTheme = when (currentTheme) {
            Theme.CYAN.id -> {
                Theme.TEAL.id
            }
            Theme.TEAL.id -> {
                Theme.CYAN.id
            }
            else -> Theme.TEAL.id
        }
        Log.e("Theme", "$currentTheme")
        setTheme()
    }
}