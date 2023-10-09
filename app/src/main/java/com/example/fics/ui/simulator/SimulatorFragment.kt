package com.example.fics.ui.simulator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fics.databinding.FragmentSimulatorBinding


//Each fragment in the UI is associated with the mainActivitu
//think of them as subclasses that rely on a main class, although they define their own lifecycles
//they are dependent on the activity the are linked to
//fragments are reusable pieces of UI
class SimulatorFragment : Fragment() {

    private var _binding: FragmentSimulatorBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.

    private val binding get() = _binding!!
    //the !! operator converts any value
    // to a non-nullable type and throws an exception if the value is null

    //the get() returns the non-null instance of _binding

    //onCreateView() is one of the many fragment lifecycle funcs in Android
    //creates and returns the view hierarchy associated with the fragment
    //https://developer.android.com/reference/android/app/Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val simulatorViewModel =
            ViewModelProvider(this).get(SimulatorViewModel::class.java)

        _binding = FragmentSimulatorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSimulator
        simulatorViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}