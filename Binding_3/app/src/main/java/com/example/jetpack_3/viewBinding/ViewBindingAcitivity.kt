package com.example.jetpack_3.viewBinding

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.jetpack_3.R
//import com.example.jetpack_3.databinding.ActivityViewBindingAcitivityBinding
//
//class ViewBindingAcitivity : AppCompatActivity() {
//    private lateinit var binding : ActivityViewBindingAcitivityBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//
//        // RecyclerView ViewBinding
//        binding = ActivityViewBindingAcitivityBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//
//        val array = ArrayList<String>()
//        array.add("A")
//        array.add("B")
//        array.add("C")
//        array.add("D")
//        array.add("E")
//        array.add("A")
//        array.add("B")
//        array.add("C")
//        array.add("D")
//        array.add("E")
//        array.add("A")
//        array.add("B")
//        array.add("C")
//        array.add("D")
//        array.add("E")
//
//        val customViewAdapter = CustomViewAdapter(array)
//        val rv = binding.rv
//        rv.adapter = customViewAdapter
//        rv.layoutManager = LinearLayoutManager(this)
//
//    }
//}