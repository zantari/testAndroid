package com.example.testgithub

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.time.delay

class MainActivity : AppCompatActivity() {
    private var goodAnswer = 0


    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var exercise: TextView


    private var currentQuestionIndex = 0
    private var currentLevelIndex = 0


    private val lvl1 = listOf(
        Question("2 + 2 = ?", listOf("2", "4", "6"), 1),
        Question("4 + 4 = ?", listOf("4", "6", "8"), 2),
        Question("6 + 4 = ?", listOf("8", "20", "10"), 2)
    )

    private val lvl2 = listOf(
        Question("2 + 4 = ?", listOf("6", "2", "4"), 0),
        Question("4 + 4 = ?", listOf("4", "6", "8"), 2),
        Question("6 + 4 = ?", listOf("8", "20", "10"), 2)
    )



    private val levelSequence = listOf(lvl1, lvl2)


    private fun loadQuestion(){
        val currentLevel = levelSequence[currentLevelIndex]
        val currentQuestion = currentLevel[currentQuestionIndex]
        exercise.text = currentQuestion.questionText

        btn1.text = currentQuestion.answers[0]
        btn2.text = currentQuestion.answers[1]
        btn3.text = currentQuestion.answers[2]
    }

    private fun checkAnswer(selectedAnswerIndex: Int) {
        if (currentQuestionIndex >= lvl1.size) {
            return
        }

        val currentLevel = levelSequence[currentLevelIndex]
        val currentQuestion = currentLevel[currentQuestionIndex]

        if (selectedAnswerIndex == currentQuestion.correctAnswer) {
            currentQuestionIndex++

            if (currentQuestionIndex >= lvl1.size) {
                exercise.text = "xxxyou won!"

                btn2.visibility = View.GONE
                btn3.visibility = View.GONE
                currentLevelIndex++
                btn1.text = "next lxxevel: "+currentQuestion.questionText


            } else {
                loadQuestion()
            }
        }
    }


    private lateinit var startBtn: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        startBtn = findViewById(R.id.startBtn)



        startBtn.setOnClickListener {
            btn1 = findViewById(R.id.button1)
            btn2 = findViewById(R.id.button2)
            btn3 = findViewById(R.id.button3)
            exercise = findViewById(R.id.exercise)
            startBtn.visibility = View.GONE

            loadQuestion()

            btn1.setOnClickListener {
                checkAnswer(0)
            }

            btn2.setOnClickListener {
                checkAnswer(1)
            }
            btn3.setOnClickListener {
                checkAnswer(2)
            }





        }

    }
}