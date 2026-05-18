package com.example.matru_snehhealth

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KickCounterActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var tvCounter: TextView
    private val PREFS_NAME = "KickCounterPrefs"
    private val KEY_COUNT = "kick_count"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kick_counter)

        tvCounter = findViewById(R.id.tvKickCount)
        val btnClick = findViewById<Button>(R.id.btnCountKick)
        val btnReset = findViewById<Button>(R.id.btnResetCount)

        // Load saved count
        val sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        count = sharedPref.getInt(KEY_COUNT, 0)
        tvCounter.text = count.toString()

        btnClick.setOnClickListener {
            count++
            updateCount()
        }

        btnReset.setOnClickListener {
            count = 0
            updateCount()
        }
    }

    private fun updateCount() {
        tvCounter.text = count.toString()
        val sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        sharedPref.edit().putInt(KEY_COUNT, count).apply()
    }
}