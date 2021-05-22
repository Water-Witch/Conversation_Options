package com.example.conversationoptions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.conversationoptions.R
import kotlinx.android.synthetic.main.fragment_title.*
import kotlinx.android.synthetic.main.fragment_title.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}