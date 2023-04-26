package com.example.foregroundservice20022023

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

/**
 * Created by pphat on 4/26/2023.
 */
class MyService: Service() {

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        Log.d("BBB", "onCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val text = intent?.getStringExtra("text")
        Toast.makeText(this, "onStartCommand: $text", Toast.LENGTH_SHORT).show()
        Log.d("BBB", "onStartCommand")
        return START_REDELIVER_INTENT
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("BBB", "onDestroy")
        super.onDestroy()
    }
}
