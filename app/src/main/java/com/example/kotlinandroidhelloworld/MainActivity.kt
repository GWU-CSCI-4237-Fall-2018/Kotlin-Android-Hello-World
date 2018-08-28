package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 */
class MainActivity : AppCompatActivity() {
    /*

    ? --> may be set to null
    val myString: String = 'Hello world'
    val --> mutable, cannot be reassigned ie no myString = 'New Value'
        var can be reassigned

    */

    //lists are immutable by default (can't add to it)


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listofstring: List<String> = listOf("a", "b", "c")

        val mutableListOfStrings: MutableList<String> = mutableListOf("a", "b", "c")
        mutableListOfStrings.add("D")

        updateText("We need to update this code to Kotlin!")
    }

    /*private fun foo(nonNullInt: Int, immutableListOfString: List <String>) String {
        return "ASFD"
    }*/


    private fun updateText(newText: String) {
        val textView = findViewById<TextView>(R.id.textview)
        textView.text = newText
    }
}
