package com.gandalf.baha.financial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.gandalf.baha.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class StocksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks)
        val emojiTextView: TextView = findViewById(R.id.emojiTextView)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { radioGroup, radioButtonID ->
            val selectedRadioButton = radioGroup.findViewById<RadioButton>(radioButtonID)
            emojiTextView.text = when (selectedRadioButton.text) {
                "Human" -> "بازار در یک نگاه"
                "Elf" -> "نمادهای پربیننده"
                "Hobbit" -> "تاثیر مثبت در شاخص"
                else -> "تاثیر منفی در شاخص"
            }
        }
        val btBottomSheetDialog: Button = findViewById(R.id.btBottomSheetDialog)
         btBottomSheetDialog.setOnClickListener(View.OnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog_crypto_currencies_filter, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        })
    }
}