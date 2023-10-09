package com.example.fics.ui.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WelcomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Welcome Fragment"
    }
    val text: LiveData<String> = _text
}