package com.example.pratciesetofchaper4;

import android.content.Intent;
import android.net.Uri;
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

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(v -> {
            String urltext = editText.getText().toString();
            if(urltext.isEmpty()) {
                Toast.makeText(this, "Please Enter The url", Toast.LENGTH_SHORT).show();
            } else if (!urltext.startsWith("http://") && !urltext.startsWith("https://")) {
                urltext = "https://" + urltext;
            }
            Uri webpage = Uri.parse(urltext);
            
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            Intent chosser = Intent.createChooser(intent, "Open With");
            startActivity(chosser);

        });

    }
}