package com.example.jetpack_viewmodel2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//fragment랑 엑티비티랑 라이프사이클이 다르기 때문에 뷰모델을 프라그먼트에 적용한다고해서 잘 적용되지않음.
        if(savedInstanceState==null) { // 이거하면 되는데 권장하지 않음.

            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.framArea, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}