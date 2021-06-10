package com.example.sparksfoundationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class NextPage extends AppCompatActivity {
    Button google,facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        google=findViewById(R.id.google);
        facebook=findViewById(R.id.fb);

        findViewById(R.id.google).setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(),Google.class);
            startActivity(intent);
        });

        findViewById(R.id.fb).setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(),Facebook.class);
            startActivity(intent);
        });
    }
}