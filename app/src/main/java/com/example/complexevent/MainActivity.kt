package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textedit: EditText = findViewById(R.id.editTextTextPersonName)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val button: Button = findViewById(R.id.button)
        val progressbar: ProgressBar = findViewById(R.id.progressBar2)

        button.setOnClickListener {
            if (checkBox.isChecked){
                textedit.text = textedit.text
                checkBox.isChecked = false
                if (progressbar.progress == 100)
                    progressbar.progress = 10
                else{
                    progressbar.progress +=10
                }
            }
        }
    }
}