package com.hollyfurniture.ultimatefunzone

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()
        web.loadUrl("file:///android_asset/index.html")
        setContentView(web)
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        setContentView(android.widget.TextView(this).apply {
            text = "Use the game’s Back button to return. Close the app to exit."
            textSize = 18f
            setPadding(32, 64, 32, 32)
        })
    }
}
