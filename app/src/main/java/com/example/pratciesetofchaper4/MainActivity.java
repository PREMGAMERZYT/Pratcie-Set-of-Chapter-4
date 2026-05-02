package com.example.pratciesetofchaper4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private EditText editText;

    private int randnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        randnumber = numgenerator();
        Log.d("harry", String.valueOf(randnumber));

        button2.setOnClickListener(v -> {
            randnumber = numgenerator();
            Log.d("harry",String.valueOf(randnumber));
        });

    }

    public static int numgenerator() {
        Random rand = new Random();
        int randinteger = rand.nextInt(100);
        return randinteger;

    }
}