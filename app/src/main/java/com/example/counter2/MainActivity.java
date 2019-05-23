package com.example.counter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plusA = findViewById(R.id.teamA_plus);
        Button plusB = findViewById(R.id.teamB_plus);
        Button minusA = findViewById(R.id.teamA_minus);
        Button minusB = findViewById(R.id.teamB_minus);
        final TextView pointsA= findViewById(R.id.teamA_points);
        final TextView pointsB = findViewById(R.id.teamB_points);

        final int tempA[] = {0};
        final int tempB[] = {0};

        pointsA.setText(String.valueOf(tempA[0]));
        pointsB.setText(String.valueOf(tempB[0]));

        plusA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsA.setText(String.valueOf(++tempA[0]));
            }
        });

        minusA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempA[0] > 0) {
                    pointsA.setText(String.valueOf(--tempA[0]));
                } else {
                    Toast.makeText(getApplicationContext(), "Cannot have negative points", Toast.LENGTH_SHORT).show();
                }
            }
        });

        plusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointsB.setText(String.valueOf(++tempB[0]));
            }
        });

        minusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempB[0] > 0) {
                    pointsB.setText(String.valueOf(--tempB[0]));
                } else {
                    Toast.makeText(getApplicationContext(), "Cannot have negative points", Toast.LENGTH_SHORT).show();
                }
            }
        });

        }

    }