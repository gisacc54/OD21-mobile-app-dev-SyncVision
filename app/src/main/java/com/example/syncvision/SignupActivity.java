package com.example.syncvision;

import android.content.Intent;
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
        Log.i("Status", "onCreate");


        findViewById(R.id.editTextText3);
        Button signUpButton = findViewById(R.id.button3);

        // Handle sign-up button click
        signUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Status", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Status", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Status", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Status", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Status", "onRestart");
    }
}