package com.example.jetpack_coroutine1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// 간단하게 코루틴과 ViewModelScope
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToSecond = findViewById<Button>(R.id.gotosecond)
        goToSecond.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            startActivity(intent)
        }

//        Log.d("TESTabc","Start")
//
//        //코루틴 실행
//        CoroutineScope(Dispatchers.IO).launch{
//            Log.d("TESTabc","CoroutineScope Start")
//        a()
//        b()
//
//        }
//        Log.d("TESTabc","CoroutineScope END")


    }
    //suspend 중지하다.
//    suspend fun a(){
//        delay(1000)
//        Log.d("TESTabc","AP1")
//        delay(1000)
//        Log.d("TESTabc","AP2")
//    }
//    suspend fun b(){
//        delay(1000)
//        Log.d("TESTabc","BP1")
//        delay(1000)
//        Log.d("TESTabc","BP2")
//
//    }
}