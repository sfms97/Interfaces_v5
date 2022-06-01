package com.example.test2.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ocio cercano"
    }

    val text: LiveData<String> = _text

    private val _text2 = MutableLiveData<String>().apply {
        value = "Buscar"
    }
    val text2: LiveData<String> = _text2
}