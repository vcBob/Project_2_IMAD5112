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
    private val arrQuiz = arrayOf(
        "Napoleon Bonaparte was exiled to the island of Elba before his final defeat at Waterloo.",
        "The ancient city of Machu Picchu was built by the Aztecs.",
        "The Cold War included direct military conflict between the United States and the Soviet Union.",
        "Julius Caesar was assassinated on the Ides of March in 44 BC.",
        "The Black Death significantly reduced Europe’s population in the 14th century.")
    private val arrAns = booleanArrayOf(true,false,false,true,true)
    //Kotlinlang.2024. Create arrays(Version 1.0) [Source code]. https://kotlinlang.org/docs/arrays.html (Accessed 23 May 2025).
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
        // Adrian, T.2019.findviewbyid in Kotlin (Version 1.0) [source code]. https://medium.com/android-ideas/findviewbyid-in-kotlin-ce4d22193c79 (Accessed 24 May 2025)
        //==========================================================================================

        //==========================================================================================
        //Hide next button at the start of the program.
        btnNext.setVisibility(View.GONE)
        //dcd.2020. How to set visibility in Kotlin(Version 1.0) [Source code].https://stackoverflow.com/questions/49402001/how-to-set-visibility-in-kotlin (Accessed 23 May 2025).
        //==========================================================================================

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
        // Coeur.2017.Android - How to achieve setOnClickListener in Kotlin?(Version 1.0) [source code].https://stackoverflow.com/questions/44301301/android-how-to-achieve-setonclicklistener-in-kotlin (Accessed 24 May 2025)

        //==========================================================================================

        //==========================================================================================
        //display questions,check score,move to next screen.
        var index = 0
        var score = 0
        txtHistQuiz.text = "QUESTION(${index+1}):\n${arrQuiz[index+1]}"

        btnNext.setOnClickListener {
            btnNext.setVisibility(View.GONE)
            btnTrue.isClickable = true
            btnFalse.isClickable = true



            if (index >= 4) {

                if (arrAns[index] == ans) {
                    score++
                    val flashcardToScore = Intent(this, ScoreScreen::class.java)
                    flashcardToScore.putExtra("score", score)
                    //flashcardToScore.putExtra("arrQuiz",arrQuiz)
                    //flashcardToScore.putExtra("arrAns",arrAns)
                    startActivity(flashcardToScore)
                } else {
                    val flashToScore = Intent(this, ScoreScreen::class.java)
                    flashToScore.putExtra("score", score)
                    //flashToScore.putExtra("arrQuiz",arrQuiz.size)
                    //flashToScore.putExtra("arrAns",arrAns.size)
                    startActivity(flashToScore)
                }
            }
            else{
                txtHistQuiz.text="QUESTION(${index+2}):\n${arrQuiz[index+1]}"

                if(arrAns[index]==ans){
                    txtFeedback.text = "Correct"
                    score++}
                else{txtFeedback.text = "Incorrect"}
                index++
            }
        }
        //Kotlinlang.2025. If expression(Version 1.0) [Source code]. https://kotlinlang.org/docs/control-flow.html#if-expression (Accessed 23 May 2025).
        //Ola, S. 2022. Intents in Kotlin(Version 1.0) [Source code]. https://stackoverflow.com/questions/39462397/intents-in-kotlin (Accessed 5 May 2025).
        //==========================================================================================
    }
}