package com.example.navigation_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// A에서 B로 가는 화살표에서 설정
// A - > B
//enterAnim : A -> B 로 갈때 B가 나타나는 방식
//exitAnim : A -> B 로 갈때 A가 사라지는 방식
//popEnterAnim : 뒤로가기로 B -> A로 올 때 A가 나타나는 방식
//popExitAnim : 뒤로가기로 B -> A로 올 때 B가 사라지는 방식
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}