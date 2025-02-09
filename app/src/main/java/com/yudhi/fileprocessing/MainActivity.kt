package com.yudhi.fileprocessing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yudhi.fileprocessing.databinding.ActivityMainBinding
import com.yudhi.fileprocessing.databinding.ActivityWebViewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPdfHandle.setOnClickListener {
            val intent = Intent(this, PdfHandleActivity::class.java)
            startActivity(intent)
        }
    }
}