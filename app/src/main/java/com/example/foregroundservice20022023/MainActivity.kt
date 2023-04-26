package com.example.foregroundservice20022023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnStartService: Button
    private lateinit var btnStopService: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStopService = findViewById(R.id.button_stop_service)
        btnStartService = findViewById(R.id.button_start_service)

        btnStartService.setOnClickListener {
            val intent = Intent(this@MainActivity, MyService::class.java)
            intent.putExtra("text", "abc")
            startService(intent)
        }

        btnStopService.setOnClickListener {
            val intent = Intent(this@MainActivity, MyService::class.java)
            stopService(intent)
        }
    }
}
