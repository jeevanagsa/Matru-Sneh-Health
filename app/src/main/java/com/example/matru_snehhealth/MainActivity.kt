package com.example.matru_snehhealth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKick = findViewById<Button>(R.id.btnKickCounter)
        val btnNutri = findViewById<Button>(R.id.btnNutrition)
        val btnRemind = findViewById<Button>(R.id.btnReminders)
        val btnDang = findViewById<Button>(R.id.btnDangerSigns)

        btnKick.setOnClickListener { startActivity(Intent(this, KickCounterActivity::class.java)) }
        btnNutri.setOnClickListener { startActivity(Intent(this, NutritionActivity::class.java)) }
        btnRemind.setOnClickListener { startActivity(Intent(this, ReminderActivity::class.java)) }
        btnDang.setOnClickListener { startActivity(Intent(this, DangerSignsActivity::class.java)) }
    }
}