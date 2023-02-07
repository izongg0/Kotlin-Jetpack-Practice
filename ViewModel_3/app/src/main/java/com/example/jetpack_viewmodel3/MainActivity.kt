package com.example.jetpack_viewmodel3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_viewmodel3.databinding.ActivityMainBinding

// ViewModel -> Activity/Fragment 공유
// why ? Activity 의 값을 Fragment 쓰고 싶거나
// Fragment 에서 값을 ViewModel 의 값으로 사용 하기 위해서


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewmodel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewmodel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.resultArea.text = viewmodel.getCount().toString()


        binding.plus.setOnClickListener {

            viewmodel.plus()
            binding.resultArea.text = viewmodel.getCount().toString()
        }
        binding.minus.setOnClickListener {

            viewmodel.minus()
            binding.resultArea.text = viewmodel.getCount().toString()

        }


        val manager = supportFragmentManager
        binding.showFragment.setOnClickListener {

            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.frameArea, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}