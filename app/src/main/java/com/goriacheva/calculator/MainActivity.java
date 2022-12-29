package com.goriacheva.calculator;

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
        TextView textViewCorrectAnswer = findViewById(R.id.textViewCorrectAnswer);
        TextView textViewIncorrectAnswer = findViewById(R.id.textViewIncorrectAnswer);

buttonAnswer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String text = editTextAnswer.getText().toString();
        if (text.equals("15")) {
            textViewCorrectAnswer.setVisibility(View.VISIBLE);
            textViewIncorrectAnswer.setVisibility(View.GONE);
        } else {
            textViewCorrectAnswer.setVisibility(View.GONE);
            textViewIncorrectAnswer.setVisibility(View.VISIBLE);
        }
    }
});
    }
}