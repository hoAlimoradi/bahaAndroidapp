package com.gandalf.baha.financial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.gandalf.baha.R

//CryptoCurrency
//  silver
class CryptoCurrenciesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crypto_currencies)
        var emojiTextView: TextView = findViewById(R.id.emojiTextView)
        var radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { radioGroup, radioButtonID ->
            val selectedRadioButton = radioGroup.findViewById<RadioButton>(radioButtonID)
            emojiTextView.text = when (selectedRadioButton.text) {
                "Human" -> "بیشترین ارزش بازار"
                "Elf" -> "بیشترین درصد افزایش"
                "Hobbit" -> "بیشترین درصد کاهش"
                else -> "بیشترین ارزش معاملات"
            }
        }
    }
}