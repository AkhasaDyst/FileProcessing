package com.yudhi.fileprocessing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yudhi.fileprocessing.databinding.ActivityMainBinding
import com.yudhi.fileprocessing.databinding.ActivityPdfHandleBinding

class PdfHandleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfHandleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfHandleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonWebView.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }
    }
}