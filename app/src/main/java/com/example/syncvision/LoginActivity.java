package com.example.syncvision;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("data", "onCreate called");
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);

        txtSignUp = findViewById(R.id.txtSignUp);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
                Log.i("data", "onStart Called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("data", "onResume Called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("data", "onPause Called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("data", "onStop Called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("data", "onDestroy Called");
    }
}