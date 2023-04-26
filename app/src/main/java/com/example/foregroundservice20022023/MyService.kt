package com.example.foregroundservice20022023

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

/**
 * Created by pphat on 4/26/2023.
 */
class MyService: Service() {

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        Log.d("BBB", "onCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("BBB", "onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.d("BBB", "onDestroy")
        super.onDestroy()
    }
}
