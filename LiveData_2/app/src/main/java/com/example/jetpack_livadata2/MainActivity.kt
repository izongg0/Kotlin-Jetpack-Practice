package com.example.jetpack_livadata2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

// LiveData 와 MutualLiveData 의 차이
// 뷰모델 밖에서 데이터를 변경하는 것을 막기위해 LiveData를 사용함.


class MainActivity : AppCompatActivity() {

        private lateinit var viewmodel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewmodel = ViewModelProvider(this).get(MainViewModel::class.java)
        findViewById<Button>(R.id.btnArea).setOnClickListener {
            viewmodel.plusLiveDataValue()
        }

        viewmodel.testLiveData.observe(this,{

            findViewById<TextView>(R.id.textArea).text = it.toString()

        })
//        viewmodel.testLiveData.value=10 // 라이브데이터로 하면 여기서 데이터 못바꿈.





//        findViewById<Button>(R.id.btnArea).setOnClickListener {
//            viewmodel.plusLiveDataValue()
//        }
//
//        viewmodel.testMutableLiveData.observe(this,{
////            findViewById<TextView>(R.id.textArea).text = viewmodel.testMutableLiveData.value.toString()
//            findViewById<TextView>(R.id.textArea).text = it.toString()
//        })
//
//        viewmodel.testMutableLiveData.value=10 // 뷰모델 밖에서 데이터를 변경하는 것을 막기위해 LiveData를 사용함.



    }
}