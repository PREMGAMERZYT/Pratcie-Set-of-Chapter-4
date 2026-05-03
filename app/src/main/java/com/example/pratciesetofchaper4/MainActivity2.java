package com.example.pratciesetofchaper4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    private EditText address;

    private EditText subject;

    private EditText message;

    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int ra = getIntent().getIntExtra("raandnumber",0);
        String congrts = "Congrulation You Won The Number Was = " + ra;
        textView = findViewById(R.id.textView2);
        textView.setText(congrts);

        address = findViewById(R.id.address);
        subject




    }
}