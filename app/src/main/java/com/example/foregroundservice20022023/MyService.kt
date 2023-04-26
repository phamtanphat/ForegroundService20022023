package com.example.foregroundservice20022023

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat

/**
 * Created by pphat on 4/26/2023.
 */
class MyService: Service() {

    private val channelId = "my_channel"
    private lateinit var notificationManager: NotificationManager

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        val notification = createNotification()
        startForeground(1, notification)
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_REDELIVER_INTENT
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun createNotification(): Notification {
        val notification = NotificationCompat.Builder(this, channelId)
        notification.setContentTitle("Thông báo")
        notification.setContentText("Bạn có tin nhắn mới")

        notificationManager = getSystemService(NotificationManager::class.java)

        // Sử dụng cho api trên 26
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(channelId, "Tin nhắn", NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(notificationChannel)
        }
        return notification.build()
    }
}
