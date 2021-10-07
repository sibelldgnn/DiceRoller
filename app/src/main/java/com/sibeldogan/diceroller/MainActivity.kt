package com.sibeldogan.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: (Button) = findViewById(R.id.button)
        val dice: (ImageView) = findViewById(R.id.imageView)
        val dice2: (ImageView) = findViewById(R.id.imageView2)

        button.setOnClickListener {
            val rnd = (1..6).random()
            val rnd2 = (1..6).random()
            when (rnd) {
                1 -> dice.setImageResource(R.drawable.dice_1)
                2 -> dice.setImageResource(R.drawable.dice_2)
                3 -> dice.setImageResource(R.drawable.dice_3)
                4 -> dice.setImageResource(R.drawable.dice_4)
                5 -> dice.setImageResource(R.drawable.dice_5)
                6 -> dice.setImageResource(R.drawable.dice_6)
            }
            when (rnd2) {
                1 -> dice2.setImageResource(R.drawable.dice_1)
                2 -> dice2.setImageResource(R.drawable.dice_2)
                3 -> dice2.setImageResource(R.drawable.dice_3)
                4 -> dice2.setImageResource(R.drawable.dice_4)
                5 -> dice2.setImageResource(R.drawable.dice_5)
                6 -> dice2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}