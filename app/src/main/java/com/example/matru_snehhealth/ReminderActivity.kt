package com.example.matru_snehhealth

import android.app.DatePickerDialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class ReminderActivity : AppCompatActivity() {

    private val PREFS_NAME = "ReminderPrefs"
    private lateinit var sharedPref: SharedPreferences

    private lateinit var tvHospitalDate: TextView
    private lateinit var tvInjectionDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reminder)

        sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        tvHospitalDate = findViewById(R.id.tvHospitalDate)
        tvInjectionDate = findViewById(R.id.tvInjectionDate)

        val btnEditHospital = findViewById<ImageButton>(R.id.btnEditHospital)
        val btnEditInjection = findViewById<ImageButton>(R.id.btnEditInjection)

        // Load saved dates or show defaults
        tvHospitalDate.text = sharedPref.getString("hospital_date", "Date: May 25, 2026")
        tvInjectionDate.text = sharedPref.getString("injection_date", "Date: June 04, 2026")

        btnEditHospital.setOnClickListener {
            showDatePicker { newDate ->
                tvHospitalDate.text = "Date: $newDate"
                sharedPref.edit().putString("hospital_date", "Date: $newDate").apply()
            }
        }

        btnEditInjection.setOnClickListener {
            showDatePicker { newDate ->
                tvInjectionDate.text = "Date: $newDate"
                sharedPref.edit().putString("injection_date", "Date: $newDate").apply()
            }
        }
    }

    private fun showDatePicker(onDateSelected: (String) -> Unit) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                val monthNames = arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
                val formattedDate = "${monthNames[selectedMonth]} $selectedDay, $selectedYear"
                onDateSelected(formattedDate)
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }
}