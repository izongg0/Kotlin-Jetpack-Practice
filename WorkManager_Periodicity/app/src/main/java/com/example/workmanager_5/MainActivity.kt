package com.example.workmanager_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

// 주기적 실행
// 15분마다 / 30분마다 ...
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workManager = PeriodicWorkRequestBuilder<Workmanager1>(15,TimeUnit.MINUTES).build()
        // 최소 15분임. 1분으로해도 15분으로 됨.

        WorkManager.getInstance(this).enqueue(workManager)
    }
}