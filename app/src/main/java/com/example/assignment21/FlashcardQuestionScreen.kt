package com.example.assignment21

import android.content.Intent
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
        val txtFeedback =findViewById<TextView>(R.id.txt_FeedBack)
        val txtUserAns =findViewById<TextView>(R.id.txt_UserAns)
        val txtUserInfo =findViewById<TextView>(R.id.txt_UserInfo)

        //==========================================================================================

        //==========================================================================================
        // Declaring and populating arrays.
        val arrQuiz = arrayOf("Q1", "Q2", "Q3", "Q4", "Q5")
        val arrAns = arrayOf("true", "false", "true", "false", "true")
        //==========================================================================================

        //==========================================================================================
        //True and false button assigning value.
        btnTrue.setOnClickListener { txtUserAns.text= "true" }
        btnFalse.setOnClickListener { txtUserAns.text="false" }
        //==========================================================================================
        var index = 0
        val userAns=txtUserAns.text.toString()

        btnNext.setOnClickListener{
          if (userAns==arrAns[index]) {txtFeedback.text="Correct"}
          else{txtFeedback.text="Incorrect"}
        }




    }

}