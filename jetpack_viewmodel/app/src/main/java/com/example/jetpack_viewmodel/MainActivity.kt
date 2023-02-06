package com.example.jetpack_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

// 안드로이드 생명 주기를 관리하기 쉽다.
//
// onSaveInstanceState() 사용해서 데이터를 관리할 수 있지만
// 적절하지 않다
//
// 안드로이드의 생명 주기를 관리하기 쉽다라는 말과 같은 말인데
// 상태(LifeCycle)가 변경될 때 마다 데이터를 관리해줘야 하는데
// 이 관리가 편하다.
//
// UI컨트롤러(Activity, Fragment)에서 모든것을 다 하려고 하면 복잡해진다
// 그래서 ViewModel을 사용하면 테스트나 관리가 용이하다.

class MainActivity : AppCompatActivity() {
//    private var count = 0
    lateinit var  viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        Log.d("qbahepf","onCreate")

        val plusBtn : Button = findViewById(R.id.plus)
        val minusBtn : Button = findViewById(R.id.minus)

        val resultArea :TextView = findViewById(R.id.result)

        resultArea.text = viewModel.countValue.toString() // 이게 없으면 변수의 값은 바뀌지만 프론트에 출력값은 안바뀜


        plusBtn.setOnClickListener {
//            count++
            viewModel.plus()
            resultArea.text = viewModel.countValue.toString()

        }
        minusBtn.setOnClickListener {
//            count--
            viewModel.minus()
            resultArea.text = viewModel.countValue.toString()

        }


    }
    override fun onStart(){
        super.onStart()
        Log.d("qbahepf","onstart")
    }
    override fun onResume(){
        super.onResume()
        Log.d("qbahepf","onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.d("qbahepf","onPause")
    }
    override fun onStop(){
        super.onStop()
        Log.d("qbahepf","onStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("qbahepf","onDestroy")
    }
}
