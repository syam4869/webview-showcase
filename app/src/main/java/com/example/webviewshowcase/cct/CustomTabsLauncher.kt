package com.example.webviewshowcase.cct

import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent

class CustomTabsLauncher(private val context: Context) {
    fun launchUrl(url: String) {
        val intent = CustomTabsIntent.Builder().build()
        intent.launchUrl(context, Uri.parse(url))
    }
}
