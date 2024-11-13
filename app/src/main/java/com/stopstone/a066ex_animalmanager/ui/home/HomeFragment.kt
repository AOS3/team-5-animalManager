package com.stopstone.a066ex_animalmanager.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.stopstone.a066ex_animalmanager.data.Storage
import com.stopstone.a066ex_animalmanager.databinding.FragmentHomeBinding
import com.stopstone.a066ex_animalmanager.ui.home.adapter.AnimalAdapter

class HomeFragment: Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val adapter: AnimalAdapter by lazy { AnimalAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvAnimalList.adapter = adapter
        adapter.submitList(Storage.items)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}