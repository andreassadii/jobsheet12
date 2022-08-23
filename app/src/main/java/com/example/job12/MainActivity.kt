package com.example.job12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext: Button = findViewById(R.id.btnNext)
        val btnShare: Button = findViewById(R.id.btnShare)

        btnNext.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        btnShare.setOnClickListener {
            val intent = Intent(this, NextActivity2::class.java)
            startActivity(intent)
        }
    }
}