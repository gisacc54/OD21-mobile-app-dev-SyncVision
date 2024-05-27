package com.example.syncvision;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class StartActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_MODE = "dark_mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start);
        Log.i("Status", "onCreate");

        // Retrieve the user's preference for dark mode
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isDarkMode = preferences.getBoolean(PREF_DARK_MODE, false);
        AppCompatDelegate.setDefaultNightMode(
                isDarkMode ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO
        );

        // Initialize the switch and set its state based on the preference

        Switch switch1 = findViewById(R.id.switch1);

        switch1.setChecked(isDarkMode);

        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }

            // Save the new preference
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean(PREF_DARK_MODE, isChecked);
            editor.apply();
        });

        Button button = findViewById(R.id.SingIn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StartActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
            }
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
