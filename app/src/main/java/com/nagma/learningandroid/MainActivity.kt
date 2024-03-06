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
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
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

        supportFragmentManager.commit { 
            add<HomeFragment>(R.id.container, null)
        }

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.action_home -> goToHome()
                R.id.action_tour -> goToTour()
                R.id.action_shop -> goToShop()
                else -> false
            }
        }

    }

    private fun goToShop(): Boolean {
        supportFragmentManager.commit {
            replace<ShopFragment>(R.id.container,null,null)
        }
        return true
    }

    private fun goToTour(): Boolean {
        supportFragmentManager.commit {
            replace<TourFragment>(R.id.container,null,null)
        }
        return true
    }

    private fun goToHome(): Boolean {
        supportFragmentManager.commit {
            replace<HomeFragment>(R.id.container, null, null)
        }
        return true
    }
}

