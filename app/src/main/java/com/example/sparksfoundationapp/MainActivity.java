package com.example.sparksfoundationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link=findViewById(R.id.link);
        findViewById(R.id.link).setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(),NextPage.class);
            startActivity(intent);
        });
    }
}