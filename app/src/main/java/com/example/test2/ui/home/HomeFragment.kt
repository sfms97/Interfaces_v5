package com.example.test2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.test2.R
import com.example.test2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.txtCalendario

        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        }
        )

        val textView2: TextView = binding.txtAadirEvento

        homeViewModel.text2.observe(viewLifecycleOwner, Observer {
            textView2.text = it
        }
        )




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}