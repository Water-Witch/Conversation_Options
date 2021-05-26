package com.example.conversationoptions

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.conversationoptions.models.MyCompliment
import com.example.conversationoptions.models.MyInsult
import com.example.conversationoptions.services.ComplimentService
import com.example.conversationoptions.services.InsultService
import com.example.conversationoptions.services.ServiceBuilder
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_title.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    val TAG = "Compliment Fragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_second, container, false)

        rootView.button_secondFragment_insults.setOnClickListener { view: View ->
            loadInsults()
        }
        rootView.button_secondFragment_compliments.setOnClickListener { view: View ->
            loadCompliments()
        }
        return rootView
    }

    private fun loadCompliments() {
        val destinationService = ServiceBuilder.buildService(ComplimentService::class.java)
        val requestCall = destinationService.getComplimentsList()

        requestCall.enqueue(object: Callback<MyCompliment> {
            override fun onFailure(call: Call<MyCompliment>, t: Throwable) {
                Log.d(TAG, "onResponse: well you failed" + t.message)
            }

            override fun onResponse(call: Call<MyCompliment>, response: Response<MyCompliment>) {
                val compliment = response.body()?.compliment ?: "ur nose hairs look nice today"
                Log.d(TAG, "onResponse: " + compliment)
                val bundle = bundleOf("compliment" to compliment)
                findNavController().navigate(R.id.action_secondFragment_to_complimentFragment, bundle)

            }

        })
    }

    private fun loadInsults() {
        val destinationService = ServiceBuilder.buildInsultService(InsultService::class.java)
        val requestCall = destinationService.getInsultsList("en", "json")

        requestCall.enqueue(object: Callback<MyInsult> {
            override fun onFailure(call: Call<MyInsult>, t: Throwable) {
                Log.d(TAG, "onResponse: well you failed" + t.message)
            }

            override fun onResponse(call: Call<MyInsult>, response: Response<MyInsult>) {
                val insult = response.body()?.insult ?: "ur arms are too fleshy"
                Log.d(TAG, "onResponse: " + insult)
                val bundle = bundleOf("insult" to insult)
                findNavController().navigate(R.id.action_secondFragment_to_insultFragment, bundle)

            }

        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
            }
    }
}