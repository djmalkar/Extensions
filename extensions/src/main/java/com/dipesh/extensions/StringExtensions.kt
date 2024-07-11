package com.dipesh.extensions

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64

fun String.isValidEmail(): Boolean {
    // Regular expression to validate email format
    val emailRegex = Regex("^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$")
    return matches(emailRegex)
}

fun String.toBitmap(): Bitmap? {
    val decodedBytes = Base64.decode(this, Base64.DEFAULT)
    return BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
}

fun String.capitalizeWords(): String {
    return split(" ").joinToString(" ") { it.capitalize() }
}

fun String?.isNullOrEmpty(): Boolean {
    return this == null || isEmpty()
}