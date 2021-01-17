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

class FundsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fund)

        val emojiTextView: TextView = findViewById(R.id.emojiTextView)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { radioGroup, radioButtonID ->
            val selectedRadioButton = radioGroup.findViewById<RadioButton>(radioButtonID)
            emojiTextView.text = when (selectedRadioButton.text) {
                "Human" -> "سهامی"
                "Elf" -> " مختلط  "
                "Hobbit" -> " درامد ثابت"
                else -> " خاص که یه اکستند لیست میشه"
            }
        }
        val btBottomSheetDialog: Button = findViewById(R.id.btBottomSheetDialog)
        btBottomSheetDialog.setOnClickListener(View.OnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog_funds_filter, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        })
    }
}