package com.abhijith.magictheme.extension

import android.text.Html
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.updateActionBarTitle(text: String, color: Int) {
    supportActionBar?.title = Html.fromHtml("<font color='${color.getContrastColor().toHex()}'>$text</font>")
}