package com.example.pratciesetofchaper4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"Apple Is Bigger Then WaterMelon?","Tree Is Bigger Then Plant?","Elephant Is Bigger Then Ant?","Is Java Was Invented in 2008?","Is Africa Is Bigger Then Russia"};

    private boolean[] answers = {false,true,true,false,true};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i<5; i++) {
            Log.d("prem", questions[i]);
        }
    }

}