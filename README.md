# History of the world flashcard app
This Program was created to help history students get ready for tests and exams.

# YouTube video:
https://youtu.be/J-_45Sk5AAQ

# INTRODUCTION:
The program allows students the test their history of the world knowlage by prompting them to answer a series of 5 true or false questions.
After all the questions that the program has to ask are answerd, the program will give the user their score and they can check their answer.

## Program Design
The program has a color theme of black, brown, white, Red and blue.
Black, brown and white is used for the history theme. 
red and blue is used for heddings an a few comments so that it the text stands out when the user is reading it.

The program broken down into 3 screens: 

## Welcome Screen

![Screenshot 2025-05-22 033649](https://github.com/user-attachments/assets/a690743d-e87b-41c4-b82e-4a6f50d68c2a)

figure 1: welcome screen 

The welcome screen has 3 components, 2 textviews and a button.

When the continue button is pressed, the user is taken from the welcome screen to the flashcard screen.
The welcome screen surves the purpose of introducing the user to the app.

## Flashcard Screen

![Screenshot 2025-05-22 033703](https://github.com/user-attachments/assets/10b16e82-55f7-41ba-ae7c-3ca97793de02)

figure 2.1: flashcard screen before answering true or false.

![Screenshot 2025-05-22 033718](https://github.com/user-attachments/assets/266ffa7a-6599-4ebc-9cc5-85a94f4b04bb)

figure 2.2: flashcard screen after answering true of false.

![Screenshot 2025-05-22 034027](https://github.com/user-attachments/assets/5a6a22e9-64a0-44c7-ba63-da4b2fcf8ac0)

figure 2.3: flashcard screen if answer is incorrect.

The flashcard screen has 8 components. 5 textviews and 3 buttons.

A variable which changes based off the true or false button that the user selects is used to check if the value of the array at its current index is the same as the value of the variable.

Code explained:
The code below Reads Through the arrQuiz array which has 5 history questions.
The user does not have an option to go to the next question until they answer a true or false question.
For every correct question the score increase, this is done by adding on point to score only for the  correct answers given by the user.
After answering true or false the next question appear until the last question in the array has been answered.
The user is then taken to the next, the score screen.

### Note:
Once a question is answered the user cannot change their answer. A next button appears after each answer is entered and disapears once the question is ment to be answered.
,this is so users do not skip questions.

## Score Screen

![Screenshot 2025-05-22 034048](https://github.com/user-attachments/assets/c2075c30-7e2b-4829-8102-39dd351a7feb)

figure 3.1: score screen before pressing 'review'.

![Screenshot 2025-05-22 034059](https://github.com/user-attachments/assets/fbf210ed-a318-45ff-b2ea-e761e7e996fa)

figure 3.2: score screen after pressing 'review'.

The score screem has 7 compnents. 4 text views and 3 buttons.

The score screen shows the user how many questions they got correct and gives a custom feedback message baised on the score the user gets in the quiz.
There is a review button for the user to check the questions they got incorrect for themselves.
The exit button takes the user out of the program to the phones home page.

## Refrencing list:

Adrian, T.2019.findviewbyid in Kotlin (Version 1.0) [source code].
https://medium.com/android-ideas/findviewbyid-in-kotlin-ce4d22193c79 
(Accessed 24 May 2025)

Coeur.2017.Android - How to achieve setOnClickListener in Kotlin?(Version 1.0) [source code].
https://stackoverflow.com/questions/44301301/android-how-to-achieve-setonclicklistener-in-kotlin 
(Accessed 24 May 2025)

Dcd.2020. How to set visibility in Kotlin(Version 1.0) [Source code]. 
https://stackoverflow.com/questions/49402001/how-to-set-visibility-in-kotlin
(Accessed 23 May 2025).

Kotlinlang.2024. Create arrays(Version 1.0) [Source code]. 
https://kotlinlang.org/docs/arrays.html 
(Accessed 23 May 2025).

Kotlinlang.2025.Append(Version 1.0) [Source code].
https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/append.html#
[Accessed 24 May 2025]

Kotlinlang.2025. If expression(Version 1.0) [Source code]. 
https://kotlinlang.org/docs/control-flow.html#if-expression 
(Accessed 23 May 2025).

Ola, S. 2022. Intents in Kotlin(Version 1.0) [Source code]. 
https://stackoverflow.com/questions/39462397/intents-in-kotlin 
(Accessed 5 May 2025).

User10516751.2018. What is the difference between finishAffinity(); and finish() methods in Android?(Version 1.0) [Source code]. 
https://stackoverflow.com/questions/53494605/what-is-the-difference-between-finishaffinity-and-finish-methods-in-and
(Accessed 23 May 2025).
