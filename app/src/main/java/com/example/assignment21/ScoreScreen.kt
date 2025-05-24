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
    //==============================================================================================
    //Populating Questions and answers arrays.
    private val arrQuestion = arrayOf(
        "Napoleon Bonaparte was exiled to the island of Elba before his final defeat at Waterloo.",
        "The ancient city of Machu Picchu was built by the Aztecs.",
        "The Cold War included direct military conflict between the United States and the Soviet Union.",
        "Julius Caesar was assassinated on the Ides of March in 44 BC.",
        "The Black Death significantly reduced Europe’s population in the 14th century.")
    private val arrAnswer = booleanArrayOf(true,false,false,true,true)
    //==============================================================================================

    //==============================================================================================
    //Private components.
    private lateinit var btnExit : Button
    private lateinit var btnReview : Button
    private lateinit var txtComment : TextView
    private lateinit var txtScore : TextView
    private lateinit var txtReview : TextView
    private lateinit var btnReviewBack : Button
    //==============================================================================================

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.score_screen)


        //==========================================================================================
        //Call all components from xml folder to kt folder.
        btnExit = findViewById(R.id.btn_Exit)
        btnReview = findViewById(R.id.btn_Review)
        txtComment = findViewById(R.id.txt_Comment)
        txtScore = findViewById(R.id.txt_Score)
        txtReview = findViewById(R.id.txtReview)
        btnReviewBack=findViewById(R.id.btn_ReviewBack)
        //==========================================================================================

        //==========================================================================================
        //creating and initialising variable.
        var index = 0
        //==========================================================================================

        //==========================================================================================
        //call score from flash screen to score screen.
        val userAns =intent .getIntExtra("score",0)

        //==========================================================================================

        //==========================================================================================
        //Custom feedback based off score.
        btnReviewBack.setVisibility(View.GONE)
        txtReview.visibility=View.GONE
        txtScore.text= "$userAns / ${arrQuestion.size}"
        if (userAns == 5){txtComment.text="You are an expert in history!"}
        else if (userAns == 4){txtComment.text="You missed gold by one point"}
        else if (userAns == 3){txtComment.text=" You did well, though you lost 40% of the points "}
        else if (userAns == 2){txtComment.text="Try harder next time."}
        else if (userAns == 1){txtComment.text="Go study!"}
        else if (userAns == 0){txtComment.text="You need to prepare for the paper, study!"}
        //==========================================================================================


        //==========================================================================================
        //Exit app.
        btnExit.setOnClickListener{finishAffinity()}
        //user10516751.2018. What is the difference between finishAffinity(); and finish() methods in Android?(Version 1.0) [Source code]. https://stackoverflow.com/questions/53494605/what-is-the-difference-between-finishaffinity-and-finish-methods-in-and (Accessed 23 May 2025).
        //==========================================================================================

        //==========================================================================================
        btnReview.setOnClickListener {

            btnReview.setVisibility(View.GONE)
            btnReviewBack.setVisibility(View.VISIBLE)
            txtReview.visibility=View.VISIBLE
            val strBuild = StringBuilder()
            for(index in arrQuestion.indices){
            strBuild.append("Question(${index+1}):\n${arrQuestion[index]} \nAnswer(${index+1}):\n${arrAnswer[index]}\n\n") }
            txtReview.text=strBuild.toString()
        }
        btnReviewBack.setOnClickListener{
            btnReviewBack.setVisibility(View.GONE)
            btnReview.setVisibility(View.VISIBLE)
            txtReview.visibility=View.GONE


        }
        //kotlinlang.2025.Append(Version 1.0) [Source code].https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/append.html#[Accessed 24 May 2025]
        //==========================================================================================
    }

}