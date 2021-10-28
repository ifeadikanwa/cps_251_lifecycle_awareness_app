package com.ifyezedev.cps_251lifecycleawarenessapp.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ifyezedev.cps_251lifecycleawarenessapp.DemoObserver
import com.ifyezedev.cps_251lifecycleawarenessapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        lifecycle.addObserver(DemoObserver())

        MainViewModel.eventText.observe(viewLifecycleOwner, { eventText ->
            binding.textview.text = eventText
        })

        return binding.root
    }


}