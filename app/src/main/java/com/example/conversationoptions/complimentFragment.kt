package com.example.conversationoptions

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.conversationoptions.models.MyCompliment
import com.example.conversationoptions.services.ComplimentService
import com.example.conversationoptions.services.ServiceBuilder
import kotlinx.android.synthetic.main.fragment_compliment.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 * Use the [complimentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class complimentFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_compliment, container, false)
        rootView.tvCompliment.text = arguments?.getString("compliment")
        return rootView
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            complimentFragment().apply {

            }
    }
}