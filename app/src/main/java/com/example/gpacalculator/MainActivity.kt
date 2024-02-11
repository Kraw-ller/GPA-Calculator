package com.example.gpacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.task.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstYearButton : CardView = findViewById(R.id.first_year_button)
        val intent :Intent =Intent(this, L1::class.java)

        firstYearButton.setOnClickListener {
            startActivity(intent)
        }

    }
}