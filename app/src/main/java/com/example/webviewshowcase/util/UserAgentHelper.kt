package com.example.webviewshowcase.util

import android.content.Context
import android.os.Build
import android.webkit.WebSettings

object UserAgentHelper {
    fun defaultUserAgent(context: Context): String {
        return WebSettings.getDefaultUserAgent(context) +
                " " + Build.MODEL + "/" + Build.VERSION.SDK_INT
    }
}
