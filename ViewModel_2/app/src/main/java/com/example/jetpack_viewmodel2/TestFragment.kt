package com.example.jetpack_viewmodel2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_viewmodel2.databinding.FragmentTestBinding

class TestFragment : Fragment() {
    private lateinit var binding : FragmentTestBinding
    var countValue = 0

    private lateinit var viewmodel : TestFragmentViewModel
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("qbahepf","onAttach")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qbahepf","onCreate")


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d("qbahepf","onCreateView")

        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container, false)


        viewmodel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)

        binding.plus.setOnClickListener {
//            countValue++
//            binding.resultArea.text = countValue.toString()
            viewmodel.plus()
            binding.resultArea.text = viewmodel.getCount().toString()
        }
        binding.minus.setOnClickListener {
//            countValue--
//            binding.resultArea.text = countValue.toString()
            viewmodel.minus()
            binding.resultArea.text = viewmodel.getCount().toString()

        }
        return binding.root
    }

    override fun onResume(){
        super.onResume()
        Log.d("qbahepf","onResume")


    }
    override fun onStop(){
        super.onStop()
        Log.d("qbahepf","onStop")


    }
    override fun onDestroyView(){
        super.onDestroyView()
        Log.d("qbahepf","onDestroyView")


    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("qbahepf","onDestroy")


    }

    override fun onDetach() {
        super.onDetach()
        Log.d("qbahepf","onDetach")

    }


}