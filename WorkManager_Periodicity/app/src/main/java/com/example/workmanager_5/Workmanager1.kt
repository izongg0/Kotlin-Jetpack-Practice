package com.example.workmanager_5

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

class Workmanager1 (context : Context, workerParameters: WorkerParameters):
    Worker(context,workerParameters) {
    override fun doWork(): Result {
        Log.d("Work1","dowork")

        val format = SimpleDateFormat("hh:mm:ss")
        val currentTime = format.format(Date())
        Log.d("Work1",currentTime)


        return Result.success()
    }
}