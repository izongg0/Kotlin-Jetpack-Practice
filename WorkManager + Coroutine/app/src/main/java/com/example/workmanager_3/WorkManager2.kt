package com.example.workmanager_3

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WorkManager2(context : Context, params : WorkerParameters): CoroutineWorker(context,params) {
    override suspend fun doWork(): Result {

        withContext(Dispatchers.IO){ //이렇게 디스패쳐 바꿔줄수도 있음
            text1()
            text2()
        }
//        text1()
//        text2()

        return Result.success()
    }
    suspend fun text1(){

        for(i in 0..3){
            Thread.sleep(1000)
            Log.d("Work1",i.toString())
        }

    }
    suspend fun text2(){

        for(i in 0..3){
            Thread.sleep(1000)
            Log.d("Work2",i.toString())
        }

    }

}