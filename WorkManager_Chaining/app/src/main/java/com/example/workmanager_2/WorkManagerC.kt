package com.example.workmanager_2

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Thread.sleep

class WorkManagerC(context : Context, workerParameters: WorkerParameters) : Worker(context,workerParameters) {
    override fun doWork(): Result {
        for(i in 0..3){
            sleep(1000)
            Log.d("WorkC",i.toString())
        }
        return Result.success()
    }

}