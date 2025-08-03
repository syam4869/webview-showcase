package com.example.webviewshowcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.webviewshowcase.cct.CustomTabsLauncher
import com.example.webviewshowcase.model.SettingsState
import com.example.webviewshowcase.ui.MainScreen
import com.example.webviewshowcase.webview.WebViewStateHolder

class MainActivity : ComponentActivity() {

    private val webViewStateHolder by lazy { WebViewStateHolder(this) }
    private val customTabsLauncher by lazy { CustomTabsLauncher(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(
                settings = SettingsState(),
                webViewStateHolder = webViewStateHolder,
                customTabsLauncher = customTabsLauncher
            )
        }
    }

    override fun onDestroy() {
        webViewStateHolder.destroy()
        super.onDestroy()
    }
}
