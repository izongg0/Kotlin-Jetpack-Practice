package com.example.workmanager_1

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf

class WorkManagerB(context : Context, workerParameters: WorkerParameters) : Worker(context,workerParameters) {

    override fun doWork(): Result {

        val a = inputData.getInt("a",1000) // 메인에서 보낸 키가 a 인 값을 가져옴.
        val b = inputData.getInt("b",2000)
        val c = inputData.getInt("c",3000)


        Log.d("dnjzm",a.toString())
        Log.d("dnjzm",b.toString())
        Log.d("dnjzm",c.toString())


        val output : Data = workDataOf("result" to 10)
        // 메인으로 전달
        return Result.success(output)
    }


}