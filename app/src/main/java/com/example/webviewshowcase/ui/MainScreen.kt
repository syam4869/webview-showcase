package com.example.webviewshowcase.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.webviewshowcase.cct.CustomTabsLauncher
import com.example.webviewshowcase.model.SettingsState
import com.example.webviewshowcase.webview.WebViewContainer
import com.example.webviewshowcase.webview.WebViewStateHolder

@Composable
fun MainScreen(
    settings: SettingsState,
    webViewStateHolder: WebViewStateHolder,
    customTabsLauncher: CustomTabsLauncher,
) {
    var useCustomTabs by remember { mutableStateOf(settings.useCustomTabs) }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Use Chrome Custom Tabs")
                Switch(
                    checked = useCustomTabs,
                    onCheckedChange = { useCustomTabs = it }
                )
            }
            Button(onClick = {
                if (useCustomTabs) {
                    customTabsLauncher.launchUrl("https://www.example.com")
                } else {
                    webViewStateHolder.loadUrl("https://www.example.com")
                }
            }) {
                Text("Open Example.com")
            }
            if (!useCustomTabs) {
                WebViewContainer(webViewStateHolder)
            }
        }
    }
}
