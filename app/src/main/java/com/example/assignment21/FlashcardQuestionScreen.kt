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
        //calling components from xml folder to kt folder.
        val txtContext = findViewById<TextView>(R.id.txt_Context)
        val txtHistQuiz = findViewById<TextView>(R.id.txt_HistQuiz)
        val btnTrue = findViewById<Button>(R.id.btn_True)
        val btnFalse = findViewById<Button>(R.id.btn_False)
        val btnContinue = findViewById<Button>(R.id.btn_Continue)
        val txtQuestion = findViewById<TextView>(R.id.txt_Question)
        //==========================================================================================
    }
}