package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 */

//public class MainActivity extends AppCompatActivity
//public (default), private, internal
class MainActivity : AppCompatActivity() {

@Override
public override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateText("This code has been updated to Kotlin!")
        }

private fun updateText(newText: String) {
        val textView = findViewById(R.id.textview)
        textView.setText(newText)
        }
        }

//Notes
//Mutability == are you allowed to change the value
//var vs val
//Lists are immutable by default (can't add to it)
//ex val listOfString: List<String> = listOf(...whatever...)
//ex val mutableListOfString: MutableList<String> = mutableListOf(...whatever...)
//mutableListOfString.add("d")