package com.example.setupapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private static final String TAG = "MainActivity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.d(TAG, "onCreate: Starting MainAct3");

        Button homePage = findViewById(R.id.MainAct_HomePage);
        Button previousPage = findViewById(R.id.MainAct3_PreviousPage);

        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked MainAct3 homePage");

                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView thirdPageImage = findViewById(R.id.thirdPageImage);
        thirdPageImage.setImageResource(R.drawable.test);

        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked MainAct3 previousPage");

                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        
    }
}