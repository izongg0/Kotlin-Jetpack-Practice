package com.example.jetpack_map1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_map1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Transformation -> map / switchmap

    // map -> 값을 return


    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//        viewModel.liveCount.observe(this,{
//            binding.resultArea1.text = it.toString()
//            binding.resultArea2.text = it.toString()
//
//        })

        viewModel.mapLiveData.observe(this,{
            binding.resultArea1.text = it.toString()
        })

        viewModel.switchMapLiveData.observe(this,{
            binding.resultArea2.text = it.toString()
        })
        binding.btnArea.setOnClickListener {
            val count = binding.inputArea.text.toString().toInt()
            viewModel.setLiveDataValue(count)
        }




    }
}