package com.myeamin.homework_2143;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * MainActivity class defines the behavior for an app that inputs a week day number
 * and outputs the corresponding weekday.
 */
public class MainActivity extends AppCompatActivity {

    // UI components
    EditText editTextWeekDayNumber;
    Button buttonCheck;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the UI components
        editTextWeekDayNumber = findViewById(R.id.editTextWeekDayNumber);
        buttonCheck = findViewById(R.id.buttonCheck);
        textViewResult = findViewById(R.id.textViewResult);

        // Set a click listener on the check button
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the user input as a trimmed string
                String weekDayNumberString = editTextWeekDayNumber.getText().toString().trim();

                // Check if the input string is empty
                if (weekDayNumberString.isEmpty()) {
                    // If no input provided, display a request for input
                    textViewResult.setText("Please enter a week day number.");
                } else {
                    // Parse the input string to an integer
                    int weekDayNumber = Integer.parseInt(weekDayNumberString);

                    if (weekDayNumber == 1) {
                        textViewResult.setText("Sunday");
                    } else if (weekDayNumber == 2) {
                        textViewResult.setText("Monday");
                    } else if (weekDayNumber == 3) {
                        textViewResult.setText("Tuesday");
                    } else if (weekDayNumber == 4) {
                        textViewResult.setText("Wednesday");
                    } else if (weekDayNumber == 5) {
                        textViewResult.setText("Thursday");
                    } else if (weekDayNumber == 6) {
                        textViewResult.setText("Friday");
                    } else if (weekDayNumber == 7) {
                        textViewResult.setText("Saturday");
                    } else {
                        textViewResult.setText("Invalid week day number. Please enter a week day number within (1-7).");
                    }
                }
            }
        });

    }
}
