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
    private lateinit var txtReview : TextView



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
        txtReview = findViewById(R.id.txtReview)
        //==========================================================================================

        var index = 0

        //==========================================================================================
        // declaring array from flash screen to score screen.
        val callScore = intent.getIntExtra("score",0)
        //==========================================================================================

        txtScore.text= "$callScore / ${arrQuestion.size}"
        if (callScore == 5){txtComment.text="You are an expert in history!"}
        else if (callScore == 4){txtComment.text="You missed gold by one point"}
        else if (callScore == 3){txtComment.text=" You did well, though you lost 40% of the points "}
        else if (callScore == 2){txtComment.text="Try harder next time."}
        else if (callScore == 1){txtComment.text="Go study!"}
        else if (callScore == 0){txtComment.text="You need to prepare for the paper, study!"}

        btnExit.setOnClickListener{finishAffinity()}
        btnReview.setOnClickListener {val strBuild = StringBuilder()
            for(index in arrQuestion.indices){
            strBuild.append("Question: ${arrQuestion[index]} \tAnswer: ${arrAnswer[index]}\n") }
            txtReview.text=strBuild.toString()
        }
    }

}