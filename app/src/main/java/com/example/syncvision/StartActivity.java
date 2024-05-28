package com.example.syncvision;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    private static final String TAG = "StartActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.d(TAG, "onCreate");

        Button startButton = findViewById(R.id.button);
        Switch aSwitch = findViewById(R.id.switch1);

        // Set the switch text initially
        aSwitch.setText(aSwitch.isChecked() ? "On" : "Off");

        // Handle switch toggle
        aSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> aSwitch.setText(isChecked ? "On" : "Off"));

        // Handle button click
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(StartActivity.this, LoginActivity.class);
            startActivity(intent);
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