package com.example.mipt_praktikos_darbas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Button buttonChangeText = findViewById(R.id.buttonChangeText);
        Button buttonChangeColor = findViewById(R.id.buttonChangeColor);
        Button buttonChangeBackground = findViewById(R.id.buttonChangeBackground);
        // comment for revert
        buttonChangeText.setOnClickListener(v -> {
            textView.setText("Sveikas Pasauli!!");
        });
        buttonChangeColor.setOnClickListener(v -> {
            textView.setTextColor(Color.CYAN);
        });
        buttonChangeBackground.setOnClickListener(v -> {
            textView.setBackgroundColor(Color.GRAY);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}