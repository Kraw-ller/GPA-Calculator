package com.example.gpacalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.FullyDrawnReporter
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class L1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_l1)

        val firstSemesterButton : CardView = findViewById(R.id.first_semester_button)
        val i: Intent = Intent(this, L01::class.java)


        firstSemesterButton.setOnClickListener {
            startActivity(i)
        }


    }
}