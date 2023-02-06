package com.example.jetpack_viewmodel3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.jetpack_viewmodel3.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    private val viewModel : MainViewModel by activityViewModels() // 이걸로 Activity와 Fragment간의 데이터를 ViewModel로 연결
    private lateinit var binding : FragmentTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container, false)
        // Inflate the layout for this fragment


        binding.fragmentText.text = viewModel.getCount().toString()
        return binding.root
    }


}