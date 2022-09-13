package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images = listOf<Int>(
            R.drawable.imag, R.drawable.imag1,
            R.drawable.imag2, R.drawable.imag3,
            R.drawable.imag8, R.drawable.imag4,
            R.drawable.imag9, R.drawable.imag4,
            R.drawable.imag6, R.drawable.imag7
        )

        val adapterView = ImagesAdapter(images)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapterView
    }
}