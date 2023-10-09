package com.example.fics.ui.glossary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fics.databinding.FragmentGlossaryBinding

class GlossaryFragment : Fragment() {

    private var _binding: FragmentGlossaryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val glossaryViewModel =
            ViewModelProvider(this).get(GlossaryViewModel::class.java)

        _binding = FragmentGlossaryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGlossary
        glossaryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}