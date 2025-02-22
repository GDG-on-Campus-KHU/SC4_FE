package com.example.pack_mate

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.pack_mate.ui.theme.Pack_mateTheme

class PackWebViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                WebViewScreen()
        }
    }
}

@Composable
fun WebViewScreen() {
    val context = LocalContext.current
    android.webkit.WebView(context).apply {
        webViewClient = WebViewClient()
        loadUrl("https://packmate-three.vercel.app/main")
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Pack_mateTheme {
        WebViewScreen()
    }
}
