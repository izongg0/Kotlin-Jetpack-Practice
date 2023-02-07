package com.example.workmanager_6

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay

class TestWorkManager(context : Context, params : WorkerParameters):CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {

        Log.d("Work1","Start")
        for(i in 1..3){
            Log.d("Work1",i.toString())

            delay(1000)
        }
        Log.d("Work1","End")

        return Result.success()
    }


}