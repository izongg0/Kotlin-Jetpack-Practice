package com.example.workmanager_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.example.workmanager_4.WorkManagerTest.Companion.HowMuch


// 진행률 확인
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workManagerText = OneTimeWorkRequestBuilder<WorkManagerTest>().build()
        WorkManager.getInstance(this).enqueue(workManagerText)

        WorkManager.getInstance(this)
            .getWorkInfoByIdLiveData(workManagerText.id)
            .observe(this,{workInfo: WorkInfo? ->
                val progress = workInfo?.progress
                val value = progress?.getInt(HowMuch,0)
                if(value != 0){
                    Log.d("apdls",value.toString())
                }
                if(value == 100){
                    Log.d("apdls","이제 끝끝")
                }

            })
    }
}