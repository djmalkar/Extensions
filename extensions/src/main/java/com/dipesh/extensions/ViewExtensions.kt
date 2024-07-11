package com.dipesh.extensions

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.onClick(listener: () -> Unit) {
    setOnClickListener { listener() }
}

fun View.isVisible(): Boolean {
    return visibility == View.VISIBLE
}

fun View?.visible() {
    this?.visibility = View.VISIBLE
}

fun View?.gone() {
    this?.visibility = View.GONE
}

fun View?.invisible() {
    this?.visibility = View.INVISIBLE
}

fun View.hideKeyboard() {
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}