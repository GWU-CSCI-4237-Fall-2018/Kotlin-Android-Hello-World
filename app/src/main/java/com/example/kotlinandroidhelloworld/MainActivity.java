package com.example.kotlinandroidhelloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Let's convert this class to Kotlin as an example!
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateText("We need to update this code to Kotlin!");
    }

    private void updateText(String newText) {
        TextView textView = findViewById(R.id.textview);
        textView.setText(newText);
    }
}
