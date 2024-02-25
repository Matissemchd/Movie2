package com.example.movie2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)

        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Naviguer vers le fragment d'accueil
                    true
                }
                R.id.navigation_comics -> {
                    // Naviguer vers le fragment de comics
                    true
                }
                R.id.navigation_movies -> {
                    // Naviguer vers le fragment de films
                    true
                }
                R.id.navigation_search -> {
                    // Naviguer vers le fragment de recherche
                    true
                }
                R.id.navigation_series -> {
                    // Naviguer vers le fragment de séries
                    true
                }
                else -> false
            }
        }
        // Assurez-vous que la navigation est configurée correctement avec le NavController
        navView.setupWithNavController(navController)
    }
}
