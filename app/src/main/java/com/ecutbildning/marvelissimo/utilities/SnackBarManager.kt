package com.ecutbildning.marvelissimo.utilities

import android.graphics.Color
import android.support.design.widget.Snackbar
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

class SnackBarManager {

    fun createSnackbar(view: View, text: String, color: Int, gravity: Int = Gravity.BOTTOM) {
        val mSnackBar = Snackbar.make(view, text, Snackbar.LENGTH_LONG)
        val sView = mSnackBar.view
        val params = sView.layoutParams as FrameLayout.LayoutParams
        params.gravity = gravity
        sView.layoutParams = params
        sView.setBackgroundColor(color)
        val mainTextView = sView.findViewById(android.support.design.R.id.snackbar_text) as TextView
        mainTextView.setTextColor(Color.WHITE)
        mainTextView.textAlignment = View.TEXT_ALIGNMENT_CENTER
        mSnackBar.show()
    }

}