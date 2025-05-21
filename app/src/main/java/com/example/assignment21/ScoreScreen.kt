package com.example.assignment21

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.utilities.Score

class ScoreScreen : AppCompatActivity() {
    private val arrQuestion = arrayOf("Napoleon Bonaparte was exiled to the island of Elba before his final defeat at Waterloo.", "The ancient city of Machu Picchu was built by the Aztecs.", "The Cold War included direct military conflict between the United States and the Soviet Union.", "Julius Caesar was assassinated on the Ides of March in 44 BC."
        , "The Black Death significantly reduced Europe’s population in the 14th century.")
    private val arrAnswer = booleanArrayOf(true,false,false,true,true)

    private lateinit var btnExit : Button
    private lateinit var btnReview : Button
    private lateinit var txtComment : TextView
    private lateinit var txtScore : TextView
    private lateinit var txtReview : TextView
    private lateinit var btnReviewBack : Button



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
        btnReviewBack=findViewById(R.id.btn_ReviewBack)
        //==========================================================================================

        var index = 0

        //==========================================================================================
        // declaring array from flash screen to score screen.
        val userAns =intent .getIntExtra("score",0)
        //val arrayQuiz = intent.getIntExtra("arrQuiz",5)
        //val arrayAns = intent.getIntExtra("arrAns",5)
        //==========================================================================================

        btnReviewBack.setVisibility(View.GONE)
        txtReview.visibility=View.GONE
        txtScore.text= "$userAns / ${arrQuestion.size}"
        if (userAns == 5){txtComment.text="You are an expert in history!"}
        else if (userAns == 4){txtComment.text="You missed gold by one point"}
        else if (userAns == 3){txtComment.text=" You did well, though you lost 40% of the points "}
        else if (userAns == 2){txtComment.text="Try harder next time."}
        else if (userAns == 1){txtComment.text="Go study!"}
        else if (userAns == 0){txtComment.text="You need to prepare for the paper, study!"}

        btnExit.setOnClickListener{finishAffinity()}
        btnReview.setOnClickListener {

            btnReview.setVisibility(View.GONE)
            btnReviewBack.setVisibility(View.VISIBLE)
            txtReview.visibility=View.VISIBLE
            val strBuild = StringBuilder()
            for(index in arrQuestion.indices){
            strBuild.append("Question: ${arrQuestion[index]} \tAnswer: ${arrAnswer[index]}\n") }
            txtReview.text=strBuild.toString()
        }
        btnReviewBack.setOnClickListener{
            btnReviewBack.setVisibility(View.GONE)
            btnReview.setVisibility(View.VISIBLE)
            txtReview.visibility=View.GONE


        }
    }

}