package com.example.workmanager_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager


// WorkManager Chaining
// A -> 순서 상관없이 실행되도 괜찮음.
// B -> 순서 상관없이 실행되도 괜찮음.
// C -> 무조건 A / B 모두 실행된 후에 실행 되어야 한다.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workManagerA = OneTimeWorkRequestBuilder<WorkManagerA>().build()
        val workManagerB = OneTimeWorkRequestBuilder<WorkManagerB>().build()
        val workManagerC = OneTimeWorkRequestBuilder<WorkManagerC>().build()


//        WorkManager.getInstance(this).enqueue(workManagerA)
//        WorkManager.getInstance(this).enqueue(workManagerB)
//        WorkManager.getInstance(this).enqueue(workManagerC)

        // A와 B동시 , 이후 C 실행
        WorkManager.getInstance(this)
            .beginWith(listOf(workManagerA,workManagerB)).then(workManagerC).enqueue()
    }
}