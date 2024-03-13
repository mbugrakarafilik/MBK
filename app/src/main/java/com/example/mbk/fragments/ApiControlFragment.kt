package com.example.mbk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mbk.databinding.ApiControlFragmentBinding
import com.example.mbk.databinding.QuizMenuFragmentBinding

class ApiControlFragment : Fragment() {

    private lateinit var binding: ApiControlFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ApiControlFragmentBinding.inflate(inflater)
        return binding.root
    }
}