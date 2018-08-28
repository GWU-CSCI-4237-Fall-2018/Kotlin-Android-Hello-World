package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 */
class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myNullableString: String? = "Hello world"

        if (myNullableString != null) {
            updateText(myNullableString)
        }

    }

    private fun updateText(newText: String) {
        val textView = findViewById<TextView>(R.id.textview)
        textView.text = newText
    }
}
