package com.example.conversationoptions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_compliment.view.*
import kotlinx.android.synthetic.main.fragment_insult.view.*
import kotlinx.android.synthetic.main.fragment_second.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [insultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class insultFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_insult, container, false)
        rootView.tvInsult.text = arguments?.getString("insult")
        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            insultFragment().apply {

            }
    }
}