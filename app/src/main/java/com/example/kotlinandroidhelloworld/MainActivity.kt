package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 */
//public class MainActivity extends AppCompatActivity
//public (defult), private, internal
class MainActivity : AppCompatActivity() {

    //@Override
    //public void onCreate(Bundle savedInstanceState)
    //savedInstanceState can be null, won't throw null pointer
    //aka nullability
    //val variables cannot be reassigned, only var



    val listOfString: List<String> = listOf("a", "b", "c")
    val mutableListOfString: MutableList<String> = mutableListOf("a", "b", "c")
    mutableListOfString.add("d")

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateText("We need to update this code to Kotlin!")
    }

    private fun updateText(newText: String) {
        val textView = findViewById<TextView>(R.id.textview)
        textView.text = newText
    }
}
