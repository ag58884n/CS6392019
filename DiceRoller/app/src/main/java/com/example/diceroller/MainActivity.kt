package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
        val resetButton: Button = findViewById(R.id.button2)
        resetButton.setOnClickListener { resetDice() }
        val countupButton: Button = findViewById(R.id.button3)
        countupButton.setOnClickListener { countupDice() }
    }
    private fun rollDice()
    {
        Toast.makeText(this, "Roll button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.textView)
        //resultText.text = "Dice Rolled!"
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
    }

    private fun countupDice()
    {
        Toast.makeText(this, "Count UP button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.textView)
        //resultText.text = "Dice Rolled!"
        val str: String = textView.text.toString()
        val output = str.toInt()
        val randomInt = output + 1
        resultText.text = randomInt.toString()
    }


    private fun resetDice()
    {
        Toast.makeText(this, "reset button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = "0"
    }
}
