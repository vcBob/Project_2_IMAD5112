package com.example.assignment21

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.score_screen)
       //===========================================================================================
        //Call all components from xml folder to kt folder.
        val btnExit = findViewById<Button>(R.id.btn_Exit)
        val btnReview = findViewById<Button>(R.id.btn_Review)
        val txtComment = findViewById<TextView>(R.id.txt_Comment)
        val txtScore = findViewById<TextView>(R.id.txt_Score)
        //==========================================================================================

        btnExit.setOnClickListener{finishAffinity()}
    }
}