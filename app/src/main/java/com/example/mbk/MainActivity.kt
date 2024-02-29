package com.example.mbk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun hello() {
        log()
    }

    private fun log() {

    }
}