package com.example.kotlinandroidhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Let's convert this class to Kotlin as an example!
 *
 * Mac: CMD + SHIFT + A --> Convert Java File to Kotlin
 * Windows: CTRL + SHIFT + A --> Convert Java File to Kotlin
 *
 * Code -> Convert Java to Kotline
 */
//public class MainActivity : AppCompatActivity() {
//public (default), private, internal
class MainActivity : AppCompatActivity() {

    fun foo() {
        //onCreate(savedInstanceState);
    }

    //Mutability == can value be changed? (val vs var; mutable list vs nonmutable list)
    val myString: String = "hello world"

    //Nullability == can you set value to null
    val myStringNullable: String? = null

    //@Override
    //public void onCreate(Bundle savedInstanceState)
    public override fun onCreate(savedInstanceState: Bundle?) {

        if (savedInstanceState != null) {

        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateText("We need to update this code to Kotlin!")
    }

    private fun updateText(newText: String) {
        val textView = findViewById(R.id.textview)
        textView.setText(newText)
    }
}
