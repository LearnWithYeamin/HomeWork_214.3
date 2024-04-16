<p align="center">
<h1 align='center'>Season 2 / Section 1 / HomeWork 214.3 Solution</h1>
<h3 align='center'>
   Visit my youtube channel <a href="https://www.youtube.com/@CodeCraftArena">CodeCraft Arena</a>
</h3>
</p>

## Step 1: Here is `activity_main.xml` code.
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textViewDescription"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        android:text="Enter the number of days of the week (1-7) to find the corresponding day of the week."
        android:textSize="16sp" />

    <EditText
        android:id="@+id/editTextWeekDayNumber"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Input week day number"
        android:inputType="number" />

    <Button
        android:id="@+id/buttonCheck"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="16dp"
        android:text="Check Week Day" />

    <TextView
        android:id="@+id/textViewResult"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="16dp" />

</LinearLayout>
```
## Step 2: Here is `MainActivity.java` code.
```java
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
```
## Authors
**MD YEAMIN** - *Android Software Developer* - <a href="https://github.com/i-rin-eam">MD YEAMIN</a> - *Learn with Ease*
<h1 align="center">Thank You ❤️</h1>
