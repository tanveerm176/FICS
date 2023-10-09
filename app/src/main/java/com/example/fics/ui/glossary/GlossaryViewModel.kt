package com.example.fics.ui.glossary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GlossaryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Glossary Fragment"
    }
    val text: LiveData<String> = _text
}