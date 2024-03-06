package com.nagma.learningandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nagma.learningandroid.databinding.EntryMainBinding

class EntryActivity : AppCompatActivity() {

    private lateinit var binding: EntryMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EntryMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.entryButton.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)

        }
    }
}