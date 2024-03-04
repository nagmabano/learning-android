package com.nagma.learningandroid

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.nagma.learningandroid.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val email = binding.emailAddress.text.toString()
            val password = binding.password.text.toString()
            val message = getString(R.string.message_text, email, password)

            Snackbar.make(it, "I am a snackbar!",
                Snackbar.LENGTH_INDEFINITE)
                .setAction("Show Info"){showMessage(message)}
                .show()

            Log.i("Login Page", message)
        }



    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}