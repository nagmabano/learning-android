package com.nagma.learningandroid

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScrollingViewModel: ViewModel() {

    private val _info: MutableLiveData<Int> = MutableLiveData()

    init {
        _info.value = 0
        Log.i("ScrollingViewModel", "created")
    }

    fun loadData() {
        _info.value = _info.value!! + 1
        Log.i("ScrollingViewModel", "current value: ${_info.value}")
    }
}