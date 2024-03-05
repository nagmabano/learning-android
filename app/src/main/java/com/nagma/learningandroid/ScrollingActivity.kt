package com.nagma.learningandroid

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.nagma.learningandroid.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title

        val viewModel by viewModels<ScrollingViewModel>()

        viewModel.info.observe(this) {
            displaySnackbar(it)
        }
        binding.fab.setOnClickListener { view ->
            viewModel.loadData()
        }


    }

    private fun displaySnackbar(count: Int) {
        Snackbar.make(binding.root, "Current count: $count", Snackbar.LENGTH_LONG).show()
    }
}