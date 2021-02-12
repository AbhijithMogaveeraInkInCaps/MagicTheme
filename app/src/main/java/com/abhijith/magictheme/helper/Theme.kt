package com.abhijith.magictheme.helper

import android.content.Context
import com.abhijith.magictheme.R

/*
* List of all available themes for this app
* */
enum class Theme(
    val id: Int,
    val mPrimaryColor: Int,
    val mColorPrimaryVariant: Int,
    val mColorOnPrimary: Int
) {
    CYAN(
        R.style.Theme_MagicTheme_Cyan,
        R.color.colorPrimaryCyan,
        R.color.colorPrimaryDarkCyan,
        R.color.colorAccentCyan
    ),
    TEAL(
        R.style.Theme_MagicTheme_Teal,
        R.color.colorPrimaryTeal,
        R.color.colorPrimaryDarkTeal,
        R.color.colorAccentTeal
    )
}

fun findTheme(id: Int): Theme {
    Theme.values().forEach {
        if (it.id == id)
            return it
    }
    return Theme.CYAN
}

var Context.currentTheme
    get() = mGetIntValue(KEY_THEME, Theme.CYAN.id)
    set(value) {
        mPutIntValue(KEY_THEME, value)
    }

//object ThemeKeys {
//    val mPrimaryColor: String = "mPrimaryColor"
//    val mColorPrimaryVariant: String = "mColorPrimaryVariant"
//    val mColorOnPrimary: String = "mColorOnPrimary"
//}