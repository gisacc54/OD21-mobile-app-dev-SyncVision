package com.example.syncvision;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private static final String TAG = "SignupActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Log.d(TAG, "onCreate");

        findViewById(R.id.editTextText4);
        findViewById(R.id.editTextText5);
        findViewById(R.id.editTextText2);
        findViewById(R.id.editTextText3);
        Button signUpButton = findViewById(R.id.button3);

        // Handle sign-up button click
        signUpButton.setOnClickListener(v -> {
            // Logic for sign-up can be added here
            // For example, collect the user input and send it to your server
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}