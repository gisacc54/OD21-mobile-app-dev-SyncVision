package com.example.syncvision;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    TextView txtSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        txtSignIn = findViewById(R.id.txtSignIn);

        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
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