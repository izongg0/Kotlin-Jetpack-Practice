package com.example.workmanager_4

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay

class WorkManagerTest(context : Context, params : WorkerParameters) : CoroutineWorker(context,params) {
    companion object{
        const val HowMuch = "progress"
    }

    override suspend fun doWork(): Result {
        //i -> 1,2,3,4,5,6 ,,,,,

        // -> 퍼센트로 나타내도롱
        for(i in 1..10){
            val result = workDataOf(HowMuch to i*10)
            setProgress(result)
            delay(1000)
        }


        return Result.success()
    }

}