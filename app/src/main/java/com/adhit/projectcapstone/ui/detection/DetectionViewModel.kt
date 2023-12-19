package com.adhit.projectcapstone.ui.detection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is detection Fragment"
    }
    val text: LiveData<String> = _text
}