package com.example.webviewshowcase.webview

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewContainer(stateHolder: WebViewStateHolder) {
    AndroidView(factory = { stateHolder.webView })
}
