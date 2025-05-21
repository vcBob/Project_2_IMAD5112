package com.example.assignment21

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FlashcardQuestionScreen : AppCompatActivity() {
    //==============================================================================================
    // declaring components as private variables.

    private var questionIndex = 0
    private var select = false
    private var ans = false
    private lateinit var btnTrue: Button
    private lateinit var btnFalse: Button
    private lateinit var btnNext:  Button
    private lateinit var txtContext :TextView
    private lateinit var txtHistQuiz:TextView
    private lateinit var txtFeedback:TextView
    private lateinit var txtUserAns :TextView
    private lateinit var txtUserInfo:TextView
    //==============================================================================================

    //==============================================================================================
    // declaring private array.
    private val arrQuiz = arrayOf("Q1", "Q2", "Q3", "Q4", "Q5")
    private val arrAns = booleanArrayOf(true, false, true, false, true)

    //==============================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flashcard_question_screen)
        //==========================================================================================
        //Calling components from xml folder to kt folder.
        btnTrue = findViewById(R.id.btn_True)
        btnFalse = findViewById(R.id.btn_False)
        btnNext = findViewById(R.id.btn_Next)
        txtContext = findViewById(R.id.txt_Context)
        txtHistQuiz = findViewById(R.id.txt_HistQuiz)
        txtFeedback = findViewById(R.id.txt_FeedBack)
        txtUserAns =findViewById(R.id.txt_UserAns)
        txtUserInfo =findViewById(R.id.txt_UserInfo)
        //==========================================================================================

        //Hide next button at the start of the program.
        btnNext.setVisibility(View.GONE)
        //==========================================================================================
        //True and false button assigning value.

        btnTrue.setOnClickListener {
            ans=true
            txtUserAns.text="true"
            btnNext.setVisibility(View.VISIBLE)

            btnTrue.isClickable=false
            btnFalse.isClickable=false

        }
        btnFalse.setOnClickListener {
            ans=false
            txtUserAns.text="false"
            btnNext.setVisibility(View.VISIBLE)
            btnTrue.isClickable=false
            btnFalse.isClickable=false}
        //==========================================================================================
        var index = 0
        var score = 0
        //val userAns = txtUserAns.text.toString()
        txtHistQuiz.text = arrQuiz[index]

        btnNext.setOnClickListener {
            btnNext.setVisibility(View.GONE)
            btnTrue.isClickable = true
            btnFalse.isClickable = true



            if (index >= 4) {

                if (arrAns[index] == ans) {
                    score++
                    val flashcardToScore = Intent(this, ScoreScreen::class.java)
                    intent.putExtra("score", score)
                    startActivity(flashcardToScore)
                } else {
                    val flashToScore = Intent(this, ScoreScreen::class.java)
                    intent.putExtra("score", score)
                    startActivity(flashToScore)
                }
            }
            else{
                txtHistQuiz.text=arrQuiz[index+1]

                if(arrAns[index]==ans){
                    txtFeedback.text = "Correct"
                    score++}
                else{txtFeedback.text = "Incorrect"}
                index++
            }
        }

    }
}