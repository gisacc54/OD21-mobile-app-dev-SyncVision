package com.example.syncvision;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate");

        TextView textView = findViewById(R.id.register);

        textView.setOnClickListener(v -> {

            // For now, navigate to SignupActivity
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
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