package com.abhijith.magictheme.views

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

/*class MyTextView : AppCompatTextView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun AppCompatTextView.setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
        setTextColor(context.getColor(accentColor))
        setLinkTextColor(context.getColor(textColor))
    }
}*/
fun AppCompatTextView.setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
    setTextColor(context.getColor(accentColor))
    setLinkTextColor(context.getColor(textColor))
}