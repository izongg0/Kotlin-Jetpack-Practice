package com.example.workmanager_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkerParameters

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textBtn = findViewById<Button>(R.id.textBtn)
        textBtn.setOnClickListener {
            val testWorkManager = OneTimeWorkRequestBuilder<TestWorkManager>().build()
            // 기존에 했던 방식
//            WorkManager.getInstance(this).enqueue(testWorkManager)

            //새로운 방식
//            WorkManager.getInstance(this).enqueueUniqueWork("test",ExistingWorkPolicy.KEEP,testWorkManager)
            // 여러번 눌러도 중복실행 안됨.
            
            WorkManager.getInstance(this).enqueueUniqueWork("test",ExistingWorkPolicy.REPLACE,testWorkManager)
            // 작업중에 버튼 누르면 중지하고 새로운 작업 시작
        }
    }
}