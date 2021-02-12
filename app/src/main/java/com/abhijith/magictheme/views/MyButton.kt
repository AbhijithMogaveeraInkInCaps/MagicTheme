package com.abhijith.magictheme.views

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.widget.Button
import com.abhijith.magictheme.R

/*class MyButton : androidx.appcompat.widget.AppCompatButton {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
        setTextColor(context.getColor(textColor))
        setBackgroundColor(context.getColor(accentColor))
    }
}*/
fun androidx.appcompat.widget.AppCompatButton.setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
    setTextColor(context.getColor(textColor))
    setBackgroundColor(context.getColor(accentColor))
}
