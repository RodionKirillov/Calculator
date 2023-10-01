package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button buttonAnswer = findViewById(R.id.buttonAnswer);
        TextView textViewIncorrect = findViewById(R.id.textViewIncorrectAnswer);
        TextView textViewCorrect = findViewById(R.id.textViewCorrectAnswer);

        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editTextAnswer.getText().toString();
                int number = Integer.parseInt(text);
                if (number == 15) {
                    textViewCorrect.setVisibility(View.VISIBLE);
                    textViewIncorrect.setVisibility(View.INVISIBLE);
                } else {
                    textViewCorrect.setVisibility(View.INVISIBLE);
                    textViewIncorrect.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}