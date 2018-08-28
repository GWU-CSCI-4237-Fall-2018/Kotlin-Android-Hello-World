package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 */
class MainActivity : AppCompatActivity() {

    private fun dontPassNull(value: String) {

    }

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myString: String = "hello world"
        val myStringNullable: String? = null
        val listOfString: List<String> = listOf("a", "b", "c")
        
        if (myStringNullable != null) {
            dontPassNull(myStringNullable)
        }

        setContentView(R.layout.activity_main)

        updateText("We need to update this code to Kotlin!")
    }

    private fun updateText(newText: String) {
        val textView = findViewById<TextView>(R.id.textview)
        textView.text = newText
    }
}
