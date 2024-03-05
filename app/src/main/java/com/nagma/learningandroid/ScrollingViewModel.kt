package com.nagma.learningandroid

import android.util.Log
import androidx.lifecycle.ViewModel

class ScrollingViewModel: ViewModel() {

    init {
        Log.i("ScrollingViewModel", "created")
    }

    fun loadData() {
        Log.i("ScrollingViewModel", "load data")
    }
}