package com.example.conversationoptions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_title.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [NavHostFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_title, container, false)

        rootView.button_titleFragment_opens.setOnClickListener { view: View ->

            view.findNavController().navigate(R.id.action_titleFragment_to_secondFragment)
        }
        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TitleFragment()
    }
}
