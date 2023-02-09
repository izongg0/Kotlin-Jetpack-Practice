package com.example.navigation_2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation


class BlankFragment4 : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
//        val callback : OnBackPressedCallback = object : OnBackPressedCallback(true){
//            override fun handleOnBackPressed() {
//                    view?.let{
//                        Navigation.findNavController(it).navigate(R.id.action_blankFragment4_to_blankFragment1)
//                    }
//            }
//        }
//            requireActivity().onBackPressedDispatcher.addCallback(this,callback)


        }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_blank4, container, false)
    }

}


