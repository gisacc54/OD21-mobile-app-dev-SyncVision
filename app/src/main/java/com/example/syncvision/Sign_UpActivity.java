package com.example.syncvision;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.ViewCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;

public class Sign_UpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the Switch in your layout
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch themeSwitch = findViewById(R.id.switcher);

        // Set listener to handle theme change
        themeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Dark theme
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                // Light theme
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            recreate(); // Recreate activity to apply the new theme
        });
    }

    protected void onStart() {
        super.onStart();
        Log.i("LogName", "On start Activity Started");
        Toast.makeText(this, "on start Activity Started", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Log.i("LogName", "On Resume Activity Started");
        Toast.makeText(this, "on Resume Activity Started", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Log.i("LogName", "On pause Activity Started");
        Toast.makeText(this, "on pause Activity Started", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Log.i("LogName", "On stop Activity Started");
        Toast.makeText(this, "on stop Activity Started", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("LogName", "On destroy Activity Started");
        Toast.makeText(this, "on destroy Activity Started", Toast.LENGTH_LONG).show();
    }
}
