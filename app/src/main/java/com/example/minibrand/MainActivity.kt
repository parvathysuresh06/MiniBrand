package com.example.minibrand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigateToFragment = findViewById<Button>(R.id.log_in)

        btnNavigateToFragment.setOnClickListener {
            val intent = Intent(this, DashActivity::class.java)

            // Start the second activity
            startActivity(intent)
        }
    }
}
