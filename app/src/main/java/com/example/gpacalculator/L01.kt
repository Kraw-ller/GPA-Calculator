package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class L01 : AppCompatActivity() {

    private val courses = mutableListOf<Course>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_l01)

        val computeButton: Button = findViewById(R.id.compute_button)

        courses.add(Course("Calculus",findViewById(R.id.cc_cont), findViewById(R.id.cc_exam), findViewById(R.id.calculus_average)))
        courses.add(Course("Chemistry",findViewById(R.id.chemistry_cont), findViewById(R.id.chemistry_exam), findViewById(R.id.chemistry_average)))
        courses.add(Course("Physics",findViewById(R.id.physics_cont), findViewById(R.id.physics_exam), findViewById(R.id.physics_average)))
        courses.add(Course("Algorithmic",findViewById(R.id.algorithmic_cont), findViewById(R.id.algorithmic_exam), findViewById(R.id.algorithmic_average)))
        courses.add(Course("Research",findViewById(R.id.research_cont), findViewById(R.id.research_exam), findViewById(R.id.research_average)))
        courses.add(Course("English1",findViewById(R.id.english1_cont), findViewById(R.id.english1_exam), findViewById(R.id.english1_average)))
        courses.add(Course("Ethics",findViewById(R.id.ethics_cont), findViewById(R.id.ethics_exam), findViewById(R.id.ethics_average)))

        var physicslabAverage : Float

        computeButton.setOnClickListener {
            for (course in courses){
                course.calculateAndDisplayAverage()
            }

            val totalAverageTextView: TextView = findViewById(R.id.total_avg)
            val totalAverage = calculateTotalAverage()
            totalAverageTextView.text = "$totalAverage"
        }
    }
//    fun moduleAvrg(control : Float, exam: Float) : Float{
//        return ((control*0.4+exam*0.6).toFloat())
//    }
//    fun labAvrg(control : Float, exam: Float) : Float{
//        return ((control*0.5+exam*0.5).toFloat())
//    }
//    fun totalAvrg(avg1 : Float) : Float{
//        return 1.1F
//    }
    private fun calculateTotalAverage(): Float {
    var sum = 0f

    for (course in courses) {
        sum += course.getAverage()
    }

    // Calculate the total average
    val totalAverage: Float = if (courses.isNotEmpty()) sum / courses.size else 0f

    // Round the totalAverage to two decimal places
    return "%.2f".format(totalAverage).toFloat()
    }
}