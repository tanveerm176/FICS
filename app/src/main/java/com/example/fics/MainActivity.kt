package com.example.fics

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fics.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    //binding the mainActivity layout file to the mainActivity class
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //allowing the app to dictate text color based on sys day/night mode
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)

        //bind all layout files to the mainActivity class
        //takes an XML file as input and builds the View objects from it

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Log.v("binding root", binding.root.toString())
        //sets the content of the activity to the first layout file in mobile_nav.xml

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_welcome, R.id.navigation_glossary, R.id.navigation_history, R.id.navigation_simulator
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}