package com.example.gpacalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

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