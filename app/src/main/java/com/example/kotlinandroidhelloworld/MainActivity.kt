package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 * heres a line
 */
class MainActivity : AppCompatActivity() {

    @Override
    fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateText("We need to update this code to Kotlin!")
    }

    private fun updateText(newText: String) {
        val textView = findViewById(R.id.textview)
        textView.setText(newText)
    }
}
