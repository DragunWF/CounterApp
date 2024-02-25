package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button incrementButton;
    private Button decrementButton;
    private TextView numberText;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);
        incrementButton = findViewById(R.id.incrementButton);
        decrementButton = findViewById(R.id.decrementButton);

        setButtonListeners();
    }

    private void setButtonListeners() {
        incrementButton.setOnClickListener(v -> {
            modifyCounter(true);
        });

        decrementButton.setOnClickListener(v -> {
            modifyCounter(false);
        });
    }

    private void modifyCounter(boolean isIncrement) {
        if (isIncrement) {
            counter++;
        } else {
            counter--;
        }
        numberText.setText(String.valueOf(counter));
        Toast.makeText(MainActivity.this, "You have modified the counter!", Toast.LENGTH_SHORT).show();
    }
}