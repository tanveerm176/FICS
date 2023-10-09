package com.example.fics.ui.simulator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SimulatorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Simulator Fragment"
    }
    val text: LiveData<String> = _text
}