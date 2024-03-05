package com.nagma.learningandroid

import android.app.ActionBar
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import com.google.android.material.snackbar.Snackbar
import com.nagma.learningandroid.databinding.ActivityMainBinding

const val LOG_TAG = "lifecycle_events"
class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        lifecycle.addObserver(MyObserver())

    }
}