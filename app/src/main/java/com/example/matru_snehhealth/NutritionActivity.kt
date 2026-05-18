package com.example.matru_snehhealth

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NutritionActivity : AppCompatActivity() {

    private val PREFS_NAME = "NutritionPrefs"
    private lateinit var sharedPref: SharedPreferences
    
    // Map of CheckBox IDs to their unique storage keys
    private val checkboxMap = mapOf(
        R.id.cbRagi to "eat_ragi",
        R.id.cbMilk to "eat_milk",
        R.id.cbLeafy to "eat_leafy",
        R.id.cbPulses to "eat_pulses",
        R.id.cbFruits to "eat_fruits",
        R.id.cbBeans to "eat_beans",
        R.id.cbNuts to "eat_nuts",
        R.id.cbEggs to "eat_eggs"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)

        sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        // Initialize and setup all checkboxes
        checkboxMap.forEach { (viewId, storageKey) ->
            val checkBox = findViewById<CheckBox>(viewId)
            
            // Load saved state
            checkBox.isChecked = sharedPref.getBoolean(storageKey, false)

            // Save state on change
            checkBox.setOnCheckedChangeListener { _, isChecked ->
                sharedPref.edit().putBoolean(storageKey, isChecked).apply()
            }
        }

        // Setup Clear All button
        findViewById<TextView>(R.id.tvClearAll).setOnClickListener {
            checkboxMap.forEach { (viewId, storageKey) ->
                findViewById<CheckBox>(viewId).isChecked = false
                sharedPref.edit().putBoolean(storageKey, false).apply()
            }
        }
    }
}