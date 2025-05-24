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
        // Adrian, T.2019.findviewbyid in Kotlin (Version 1.0) [source code]. https://medium.com/android-ideas/findviewbyid-in-kotlin-ce4d22193c79 (Accessed 24 May 2025)
        //==========================================================================================

        //==========================================================================================
        //Takes user from welcome screen to flashcard screen.
        btnContinue.setOnClickListener{
           val welcomeToFlashcard = Intent(this, FlashcardQuestionScreen::class.java)
            startActivity(welcomeToFlashcard)
            //Ola, S. 2022. Intents in Kotlin(Version 1.0) [Source code]. https://stackoverflow.com/questions/39462397/intents-in-kotlin (Accessed 23 May 2025).
        }
        //==========================================================================================
    }
}