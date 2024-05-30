package com.example.syncvision;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText fullNameET;
    private EditText emailET;
    private EditText passwordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button button = findViewById(R.id.sign_up_btn);
        fullNameET = findViewById(R.id.sign_up_full_name);
        emailET = findViewById(R.id.sign_up_email);
        passwordET = findViewById(R.id.sign_up_password);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if ( v.getId() == R.id.sign_up_btn){
            this.signUp();
        }
    }

    private   void signUp(){
        String fullName = fullNameET.getText().toString();
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();
        Toast.makeText(SignUpActivity.this, "Full Name:"+fullName, Toast.LENGTH_SHORT).show();
    }
}