package com.example.assignment21

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FlashcardQuestionScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.flashcard_question_screen)

        //==========================================================================================
        //Calling components from xml folder to kt folder.
        val txtContext = findViewById<TextView>(R.id.txt_Context)
        val txtHistQuiz = findViewById<TextView>(R.id.txt_HistQuiz)
        val btnTrue = findViewById<Button>(R.id.btn_True)
        val btnFalse = findViewById<Button>(R.id.btn_False)
        val btnNext = findViewById<Button>(R.id.btn_Next)
        //==========================================================================================

        //==========================================================================================
        // Declaring and populating arrays.
        val arrQuiz = arrayOf("Q1","Q2","Q3","Q4","Q5")
        val arrAns = arrayOf("True","False","True","False","True")
        //==========================================================================================




    }
}