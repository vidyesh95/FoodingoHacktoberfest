package com.codinginflow.foodingo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.codinginflow.foodingo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Steps:
 */
/**
 * 1.Added Splash sceen
 * TODO :Getting bounce effect for status bar because of fullscreen.
 * Transclusent status for sdk 21 and 22
 * Light statusbar for sdk 23 and above
 * Light NavigationBar for sdk 27 and above
 */
/**
 * 2.Added viewBinding
 */
/**
 * 3.Added Bottom navigation
 */

/**
 * An activity that inflates a layout that has a [BottomNavigationView].
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavView.setupWithNavController(navController)
    }
}