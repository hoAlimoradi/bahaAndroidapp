package com.gandalf.baha.financial.banks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.gandalf.baha.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class BankDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank_details)
        val emojiTextView: TextView = findViewById(R.id.emojiTextView)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { radioGroup, radioButtonID ->
            val selectedRadioButton = radioGroup.findViewById<RadioButton>(radioButtonID)
            emojiTextView.text = when (selectedRadioButton.text) {
                "info" -> "اطلاعات"
                "vam" -> " وام ها  "
                "samaneh" -> "سامانه ها"
                else -> " خاص که یه اکستند لیست میشه"
            }
        }

    }
}