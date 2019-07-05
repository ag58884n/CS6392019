package com.example.dicerollerimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //lateinit var diceImage : ImageView
    //lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
        val resetButton: Button = findViewById(R.id.button2)
        resetButton.setOnClickListener { resetDice() }
        val diceImage: ImageView = findViewById(R.id.dice_image)
        //diceImage.setOnClickListener { rollDice() }
        val diceImage2: ImageView = findViewById(R.id.dice_image)
        //diceImage2.setOnClickListener { rollDice2() }

    }
    private fun rollDice()
    {
        Toast.makeText(this, "Roll button clicked",
            Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val diceImage2 : ImageView = findViewById(R.id.dice_image2)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)
    }
    private fun resetDice()
    {
        Toast.makeText(this, "Reset button clicked",
            Toast.LENGTH_SHORT).show()
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val diceImage2 : ImageView = findViewById(R.id.dice_image2)
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
}
