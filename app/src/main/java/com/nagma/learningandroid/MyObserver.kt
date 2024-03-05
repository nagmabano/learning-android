package com.nagma.learningandroid

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onConnect() {
        Log.i(LOG_TAG, "On Resume")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disconnect() {
        Log.i(LOG_TAG, "On Pause")
    }

}