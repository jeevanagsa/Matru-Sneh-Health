package com.example.matru_snehhealth

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DangerSignsActivity : AppCompatActivity() {

    private val PREFS_NAME = "EmergencyPrefs"
    private val KEY_CONTACT = "emergency_phone"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danger_signs)

        val etEmergencyContact = findViewById<EditText>(R.id.etEmergencyContact)
        val btnSaveContact = findViewById<Button>(R.id.btnSaveContact)
        val btnCallEmergency = findViewById<Button>(R.id.btnCallEmergency)

        val sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        // Load saved contact
        val savedContact = sharedPref.getString(KEY_CONTACT, "")
        etEmergencyContact.setText(savedContact)

        btnSaveContact.setOnClickListener {
            val contact = etEmergencyContact.text.toString().trim()
            if (contact.isNotEmpty()) {
                sharedPref.edit().putString(KEY_CONTACT, contact).apply()
                Toast.makeText(this, "Contact saved successfully!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }

        btnCallEmergency.setOnClickListener {
            val contact = sharedPref.getString(KEY_CONTACT, "")
            if (!contact.isNullOrEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$contact")
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please save an emergency contact first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}