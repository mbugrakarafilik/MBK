package com.example.mbk.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.mbk.R
import com.example.mbk.databinding.MenuFragmentBinding
import com.example.mbk.local.DataStoreManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MenuFragment : Fragment() {

    private lateinit var binding: MenuFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = MenuFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonQuiz.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_menuFragment_to_quizMenuFragment)
        }

        binding.buttonNews.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_menuFragment_to_apiControlFragment)
        }
    }
}