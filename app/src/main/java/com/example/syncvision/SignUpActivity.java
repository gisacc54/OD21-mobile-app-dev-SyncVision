package com.example.syncvision;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText fullNameET;
    private EditText emailET;
    private EditText passwordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button button = findViewById(R.id.sign_up_btn);
        TextView textView = findViewById(R.id.or_login);

         fullNameET = findViewById(R.id.sign_up_full_name);
         emailET = findViewById(R.id.sign_up_email);
         passwordET = findViewById(R.id.sign_up_password);

        button.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    private void signUp(){
        String fullName = fullNameET.getText().toString();
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();
        Toast.makeText(SignUpActivity.this, "Full Name: "+fullName, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.sign_up_btn){
            signUp();
        }

    }
}