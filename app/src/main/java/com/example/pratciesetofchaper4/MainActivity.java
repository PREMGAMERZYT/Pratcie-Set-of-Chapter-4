package com.example.pratciesetofchaper4;

import static java.lang.String.*;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.color.utilities.Score;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button Yes;
    private Button no;

    private TextView textView;

    private String[] questions = {"Apple Is Bigger Then WaterMelon?", "Tree Is Bigger Then Plant?", "Elephant Is Bigger Then Ant?", "Is Java Was Invented in 2008?", "Is Africa Is Bigger Then Russia"};

    private boolean[] answers = {false, true, true, false, true};
    private int score = 0;

    private int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes = findViewById(R.id.Yes);
        no = findViewById(R.id.NO);
        textView = findViewById(R.id.textView4);
        textView.setText(questions[0]);
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckingTrue();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckingFalse();
            }
        });
    }

    public void CheckingTrue() {
        if (answers[count]) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "Worng", Toast.LENGTH_SHORT).show();
        }
        Nextquestioon();
        Log.d("harry", valueOf(score));
    }

    public void CheckingFalse() {
        if (!answers[count]) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

        Nextquestioon();
        Log.d("harry", valueOf(score));

    }

    public void Nextquestioon() {
        count++;
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("score",score);

        if (count >= questions.length) {
            startActivity(intent);
        }

        textView.setText(questions[count]);
    }
}