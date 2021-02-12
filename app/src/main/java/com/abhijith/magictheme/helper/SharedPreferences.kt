package com.abhijith.magictheme.helper

import android.content.Context

const val KEY_THEME = "Theme"
private const val KEY_FIRST_RUN = "Firstrun"


/**
 * Return true if app being used for the 1st time
* */
val Context.isFirstRun: Boolean
    get() {
        val value = mGetBooleanValue(KEY_FIRST_RUN, true)
        if(value) {
            mPutBooleanValue(KEY_FIRST_RUN,false)
        }
        return value
    }

/**
 * get or set current theme
 * default value will be [Theme.CYAN]
 * */



//shared preference
const val sharedOwner: String = "ThemeActivity"

val Context.sharedPreferences get() = getSharedPreferences(sharedOwner, Context.MODE_PRIVATE)

fun Context.mPutIntValue(key: String, value: Int) {
    sharedPreferences.edit().apply {
        putInt(key, value)
        apply()
    }
}

fun Context.mGetIntValue(key: String, defaultValue: Int): Int = sharedPreferences.getInt(key, defaultValue)

fun Context.mPutBooleanValue(key: String, value: Boolean) {
    sharedPreferences.edit().apply {
        putBoolean(key, value)
        apply()
    }
}

private fun Context.mGetBooleanValue(key: String, defaultValue: Boolean): Boolean = sharedPreferences.getBoolean(key, defaultValue)