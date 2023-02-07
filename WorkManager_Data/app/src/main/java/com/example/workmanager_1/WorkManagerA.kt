package com.example.workmanager_1

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Thread.sleep
import java.lang.reflect.Parameter

class WorkManagerA(context : Context, workerParameters: WorkerParameters) : Worker(context,workerParameters) {
    override fun doWork(): Result {

        for(i in 1..15){
            sleep(1000)
            Log.d("workA","$i")
        }

        return Result.success()
    }


}