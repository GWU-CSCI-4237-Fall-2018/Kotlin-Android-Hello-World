package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 * MAC : CMD + SHIFT + A (to enter action or option name) -> Use it to convert Java to Kotlin
 * Could also find in Code menu tab (on top) and click convert Java to Kotlin
 */

// public class MainActivity extends AppCompatActivity { (Everything is public in kotlin, so the word public is unnecessary)
class MainActivity : AppCompatActivity() {

    @Override
    //public voif onCreate(Bundle saved InstanceState)
    fun onCreate(savedInstanceState: Bundle) { //If question mark like bundle?, can accept/call NULL)
        super.onCreate(savedInstanceState)

        //Mutability == are you allowed to change the value
        var myString: Strong = "Hello World"

        //Nutability == can you set value to nill
        var myStringNullable: String? = null

        myString = "new value"

        //Lists are immutable by default (can't add to it)
        val listOfStrings: MutableList<String> = mutableListOF("a", "b", "c")
        mutabeListOfString.add("d")

        if (myStringNullable != null)
        {
            dontPassNull(myStringNUllable)
        }

        setContentView(R.layout.activity_main)

        updateText("We need to update this code to Kotlin!")
    }

    private fun updateText(newText: String) {
        val textView = findViewById(R.id.textview)
        textView.setText(newText)
    }
}
