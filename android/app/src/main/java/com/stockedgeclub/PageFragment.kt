package com.stockedgeclub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PageFragment : Fragment() {
    var position : Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        position = arguments?.getInt("POSITION")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutId = if (position == 1) {
            R.layout.first_page
        } else if (position == 2) {
            R.layout.second_page
        } else if (position == 3) {
            R.layout.third_page
        } else R.layout.fragment_page
        return layoutInflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when (position) {
            1 -> return
            2 -> return
            3 -> return
            4 -> return
        }
    }

    override fun onResume() {
        super.onResume()
        if(position==4)
            (activity as MainActivity).goToReactNative()
    }
}