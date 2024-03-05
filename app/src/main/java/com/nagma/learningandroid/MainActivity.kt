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

class MainActivity : AppCompatActivity() {

    val LOG_TAG = "lifecycle_events"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        Log.i(LOG_TAG, "On Create")

//        supportActionBar?.let {
//            it.setDisplayShowHomeEnabled(true)
//            it.setDisplayUseLogoEnabled(true)
//            it.setLogo(R.drawable.ic_img_clip_art )
//        }

//        binding.hotpotSwitch.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
////                binding.hotpotImage.setImageResource(R.drawable.logo)
//                binding.hotpotImage.load("https://cdn.pixabay.com/photo/2016/03/08/20/03/flag-1244648_1280.jpg")
//            } else {
////                binding.hotpotImage.setImageResource(R.drawable.ic_launcher_foreground)
//                binding.hotpotImage.load("https://cdn.pixabay.com/photo/2013/03/01/18/40/crispus-87928_1280.jpg")
//            }
//        }

//        binding.button.setOnClickListener {
//            val email = binding.emailAddress.text.toString()
//            val password = binding.password.text.toString()
//            val message = getString(R.string.message_text, email, password)
//
//            Snackbar.make(it, "I am a snackbar!",
//                Snackbar.LENGTH_INDEFINITE)
//                .setAction("Show Info"){showMessage(message)}
//                .show()
//
//            Log.i("Login Page", message)
//        }



    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG,"On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG,"On Destroy")
    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}