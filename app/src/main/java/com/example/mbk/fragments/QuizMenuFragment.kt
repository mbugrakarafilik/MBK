package com.example.mbk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mbk.databinding.MenuFragmentBinding
import com.example.mbk.databinding.QuizMenuFragmentBinding

class QuizMenuFragment : Fragment() {

    private lateinit var binding: QuizMenuFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = QuizMenuFragmentBinding.inflate(inflater)
        return binding.root
    }


}