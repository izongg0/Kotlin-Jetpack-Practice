package com.example.workmanager_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf

// 어플 종료 후에도 작업 진행하는 기능
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        SimpleThread().start()

//        val workmanagerA = OneTimeWorkRequestBuilder<WorkManagerA>().build()
//        WorkManager.getInstance(this).enqueue(workmanagerA)

        val myData : Data = workDataOf(
            "a" to 10,
            "b" to 20
        )
        val workManagerB = OneTimeWorkRequestBuilder<WorkManagerB>().setInputData(myData).build()
        // 데이터 보내줌
        WorkManager.getInstance(this).enqueue(workManagerB)


        // 워크매니저에서 보낸 데이터 메인에서 받기
        WorkManager.getInstance(this).getWorkInfoByIdLiveData(workManagerB.id)
            .observe(this,{ info ->
                if(info != null && info.state.isFinished){
                    val result = info.outputData.getInt("result",9999)
                    Log.d("aoslwj",result.toString())
                }
            })


    }
}

//class SimpleThread : Thread(){
//
//    override fun run() {
//        super.run()
//        for(i in 1..10){
//            Log.d("MainActivity","$i")
//            sleep(1000)
//        }
//    }
//}