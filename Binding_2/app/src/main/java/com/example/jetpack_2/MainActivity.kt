package com.example.jetpack_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.jetpack_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    var testCount = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // 데이터 바인딩

        binding.databindingEx.text ="바뀐 텍스트"
        binding.databindingEx.setOnClickListener {
            var intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        // 데이터 결합
        val person = Person("개복치",20)
        binding.user = person
    }

    fun myClick(view : View){
        Log.d("apdls","onClick")
        testCount++
        val person = Person("izongg",testCount)
        binding.user = person
    }

}