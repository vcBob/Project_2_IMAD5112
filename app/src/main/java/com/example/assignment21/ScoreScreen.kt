package com.example.assignment21

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.utilities.Score

class ScoreScreen : AppCompatActivity() {
    private val arrQuestion = arrayOf("Q1", "Q2", "Q3", "Q4", "Q5")
    private val arrAnswer = booleanArrayOf(true, false, true, false, true)

    private lateinit var btnExit : Button
    private lateinit var btnReview : Button
    private lateinit var txtComment : TextView
    private lateinit var txtScore : TextView



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.score_screen)



        //===========================================================================================
        //Call all components from xml folder to kt folder.
        btnExit = findViewById(R.id.btn_Exit)
        btnReview = findViewById(R.id.btn_Review)
        txtComment = findViewById(R.id.txt_Comment)
        txtScore = findViewById(R.id.txt_Score)
        //==========================================================================================

        //==========================================================================================
        // declaring array from flash screen to score screen.
        val callScore = intent.getIntExtra("score",0)
        val callAns = intent.getBooleanArrayExtra("answer")
        val callQuiz = intent. getStringArrayExtra("quiz")
        //==========================================================================================







        btnExit.setOnClickListener{finishAffinity()}
        btnReview.setOnClickListener{}
    }

}