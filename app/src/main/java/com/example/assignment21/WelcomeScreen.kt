package com.example.assignment21

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.welcome_screen)

        //==========================================================================================
        //This Calling all components from xml folder to kt folder.
        val txtQuestion = findViewById<TextView>(R.id.txt_Question)
        val txtInstruction = findViewById<TextView>(R.id.txt_Instruction)
        val btnContinue = findViewById<Button>(R.id.btn_Continue)
        //==========================================================================================

        //==========================================================================================
        //Switch between pages.
        btnContinue.setOnClickListener{
           val welcomeToFlashcard = Intent(this, FlashcardQuestionScreen::class.java)
            startActivity(welcomeToFlashcard) }
        //========================================================================================== 
    }


}