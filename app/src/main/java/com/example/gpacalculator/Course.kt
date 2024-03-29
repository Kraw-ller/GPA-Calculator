// Course.kt

package com.example.gpacalculator

import android.widget.EditText
import android.widget.TextView

class Course(private val courseName: String,
             private val controlEditText: EditText,
             private val examEditText: EditText,
             private val averageTextView: TextView,
             private val coefTextView: TextView) {
    private var average: Float = 0f
    private var coef: Float = 0f

    // Function to calculate the module average
    private fun calculateAverage(): Float {
        return ((controlEditText.text.toString().toFloat() * 0.4 + examEditText.text.toString().toFloat() * 0.6).toFloat())
    }

    // Function to display the module average
    fun calculateAndDisplayAverage() {
        average = calculateAverage()
        averageTextView.text = average.toString()
    }

    fun getAverage(): Float {
        return average
    }

    fun getCoef(): Float {
        val coefString = coefTextView.text.toString()
        return if (coefString.isNotEmpty()) {
            try {
                coefString.toFloat()
            } catch (e: NumberFormatException) {
                // Handle the case where the conversion fails
                0f
            }
        } else {
            0f
        }
    }
}
