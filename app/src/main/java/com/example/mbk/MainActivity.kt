package com.example.mbk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mbk.databinding.ActivityMainBinding
import com.example.mbk.menu.MenuFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        show()

    }

    private fun show() {
        supportFragmentManager.beginTransaction().add(R.id.frame_layout,MenuFragment()).commit()
    }

}