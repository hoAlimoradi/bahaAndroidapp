package com.gandalf.baha.financial.coin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.gandalf.baha.R

class CoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)
        val emojiTextView: TextView = findViewById(R.id.emojiTextView)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { radioGroup, radioButtonID ->
            val selectedRadioButton = radioGroup.findViewById<RadioButton>(radioButtonID)
            emojiTextView.text = when (selectedRadioButton.text) {
                "info" -> "سکه"
                "vam" -> "گواهی سپرده سکه "
                "samaneh" -> "حباب سکه"
                else -> "پارسیان"
            }
        }
    }
}