package com.example.syncvision;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class StartActivity extends AppCompatActivity {

    private static final String TAG = "StartActivity";
    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_MODE = "dark_mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start);
        Log.i("Status", "onCreate");


        // Load the theme from preferences
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean darkMode = preferences.getBoolean(PREF_DARK_MODE, false);

        if (darkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        Button startButton = findViewById(R.id.button);
        Switch themeSwitch = findViewById(R.id.switch1);

        // Set the switch to the correct state
        themeSwitch.setChecked(darkMode);

        // Handle switch toggle
        themeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean(PREF_DARK_MODE, isChecked);
            editor.apply();

            // Update the theme
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }

            // Restart activity to apply theme change
            recreate();
        });

        // Handle button click
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(StartActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Status", "onStart");
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
