package com.yudhi.fileprocessing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.yudhi.fileprocessing.databinding.ActivityWebViewBinding
import com.yudhi.fileprocessing.utils.Utils


class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    private lateinit var utils: Utils
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        utils = Utils()
        binding.apply {
            WebView.webViewClient = WebViewClient()
            WebView.settings.setSupportZoom(true)
            WebView.settings.domStorageEnabled = true
            WebView.settings.javaScriptEnabled = true
            val url = utils.getPdfUrl()
            WebView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
        }
    }

}