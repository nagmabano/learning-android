package com.nagma.learningandroid

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.nagma.learningandroid.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        addSomeView(3)
    }

    fun addSomeView(count: Int) {
        for (i in 1..count) {
            val textView = TextView(this)
            textView.text = "Hey learner #$i"
            textView.textSize = 20f
            binding.myLayout.addView(textView)
//            my_layout.addView(textView)
        }
        val button = Button(this)
        button.text = getString(R.string.click_me)
        binding.myLayout.addView(button)
//        my_layout.addView(button)
        val button1 = Button(this)
        button1.text = "Click me!"
        findViewById<LinearLayout>(R.id.my_layout).addView(button1)
    }
 }