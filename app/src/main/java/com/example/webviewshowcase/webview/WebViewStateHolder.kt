package com.example.webviewshowcase.webview

import android.content.Context
import android.webkit.WebView
import com.example.webviewshowcase.util.UserAgentHelper

class WebViewStateHolder(context: Context) {
    val webView: WebView = WebView(context).apply {
        settings.userAgentString = UserAgentHelper.defaultUserAgent(context)
    }

    fun loadUrl(url: String) {
        webView.loadUrl(url)
    }

    fun destroy() {
        webView.apply {
            stopLoading()
            clearHistory()
            removeAllViews()
            destroy()
        }
    }
}
