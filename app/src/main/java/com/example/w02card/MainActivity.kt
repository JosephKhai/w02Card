package com.example.w02card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card = Card(Suit.HEARTS, Rank.ACE)
        val aceView = findViewById<TextView>(R.id.ace_View)
        aceView.text = card.getDetails()

        val flipButton = findViewById<TextView>(R.id.flip_button)

        flipButton.setOnClickListener(){
            card.flip()
            aceView.text = card.getDetails()
        }




    }
}