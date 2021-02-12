package com.abhijith.magictheme.views

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

/*
class MyBottomNavigationView(context: Context, attrs: AttributeSet?) :
    BottomNavigationView(context, attrs) {

    @SuppressLint("RestrictedApi")
    fun MyBottomNavigationView.setColors(selectColor: Int, unselectedColor: Int, backgroundColor: Int) {
        val states = arrayOf(
            intArrayOf(-android.R.attr.state_checked),
            intArrayOf(android.R.attr.state_checked)
        )
        val thumbColors = intArrayOf(resources.getColor(unselectedColor), resources.getColor(selectColor))
        setBackgroundColor(resources.getColor(backgroundColor))
        (0..childCount).forEach {
            (getChildAt(it) as BottomNavigationMenuView?)?.apply {
                this.iconTintList = ColorStateList(states, thumbColors)
                this.itemTextColor = ColorStateList(states, thumbColors)
            }
        }
    }
}
*/

@SuppressLint("RestrictedApi")
fun BottomNavigationView.setColors(selectColor: Int, unselectedColor: Int, backgroundColor: Int) {
    val states = arrayOf(
        intArrayOf(-android.R.attr.state_checked),
        intArrayOf(android.R.attr.state_checked)
    )
    val thumbColors = intArrayOf(resources.getColor(unselectedColor), resources.getColor(selectColor))
    setBackgroundColor(resources.getColor(backgroundColor))
    (0..childCount).forEach {
        (getChildAt(it) as BottomNavigationMenuView?)?.apply {
            this.iconTintList = ColorStateList(states, thumbColors)
            this.itemTextColor = ColorStateList(states, thumbColors)
        }
    }
}