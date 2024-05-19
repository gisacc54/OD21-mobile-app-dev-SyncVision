package com.example.mysignupapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private lateinit var modeSwitch: SwitchCompat
    private var nightMode:Boolean=false
    private var editor:SharedPreferences.Editor?=null
    private var sharedPreferences:SharedPreferences?=null


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modeSwitch= findViewById(R.id.mode_switch)

                sharedPreferences= getSharedPreferences("MODE",Context.MODE_PRIVATE)
                        nightMode=sharedPreferences?.getBoolean("night",false)!!
            if(nightMode){

                modeSwitch.isChecked=true
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

            }
            modeSwitch.setOncheckedchangeLister{compoundButton, state ->}
            if (nightMode){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                editor=sharedPreferences?.edit()

                editor?.putBoolean("night",false)
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                editor=sharedPreferences?.edit()
                editor?putBoolean("night",true)

            }
                editor?.apply
        EditText username = (EditText) findViewById(R.id.username);

        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);

                regbtn. setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                String username1= username.getText().toString();
                Toast.makeText(MainActivity.this,"username is"+username1, Toast.LENGTH_SHORT).show();
            };
        });
    }
}