package com.example.fics.ui.simulator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fics.databinding.FragmentSimulatorBinding
import com.example.fics.ui.welcome.WelcomeViewModel

class SimulatorFragment : Fragment() {

    private var _binding: FragmentSimulatorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val welcomeViewModel =
            ViewModelProvider(this).get(WelcomeViewModel::class.java)

        _binding = FragmentSimulatorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSimulator
        welcomeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}