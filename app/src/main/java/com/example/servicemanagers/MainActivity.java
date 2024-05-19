package com.example.servicemanagers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Service Manager", "Created Application");

        start = findViewById(R.id.startButton);
        stop = findViewById(R.id.stopButton);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v == start){
            startService(new Intent(this, NewService.class));
        }
        else {
            stopService(new Intent(this, NewService.class));
        }
    }
}