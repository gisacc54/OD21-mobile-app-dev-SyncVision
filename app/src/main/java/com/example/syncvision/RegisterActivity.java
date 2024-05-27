package com.example.syncvision;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        Log.i("Status", "onCreate");

        Button button = findViewById(R.id.SingIn2);  // Ensure the ID matches the layout file

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Button Click", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
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
