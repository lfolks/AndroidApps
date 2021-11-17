package com.example.stringbo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Str1, Str2;

    Button CombineString1_2;
    TextView CombineStringResult;

    Button CompareString1_2;
    TextView CompareStringResult;

    Button CountStrings1_2;
    TextView CountVowelStringResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Str1 = (EditText)findViewById(R.id.StringOne);
        Str2 = (EditText)findViewById(R.id.StringTwo);
        CombineString1_2 = (Button)findViewById(R.id.btnCombineString);
        CombineStringResult = (TextView)findViewById(R.id.CombineStringResult);

        CombineString1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CombineStringResultValue = Str1.getText().toString() + " " + Str2.getText().toString();
                CombineStringResult.setText(CombineStringResultValue);
            }
        });

        CompareString1_2 = (Button)findViewById(R.id.btnCompareString);
        CompareStringResult = (TextView)findViewById(R.id.CompareStringResult);

        CompareString1_2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(Str1.getText().toString().equals(Str2.getText().toString())){
                    CompareStringResult.setText("Matching!");
                }else{
                    CompareStringResult.setText("Not Matching!");
                }
            }
        });

        CountStrings1_2 = (Button)findViewById(R.id.btnCountVowelString);
        CountVowelStringResult = (TextView)findViewById(R.id.CountVowelStringResult);

        CountStrings1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String CountStringVowels1_2 = Str1.getText().toString().toLowerCase() + Str2.getText().toString().toLowerCase();
                int VowelCount = CountStringVowels1_2.replaceAll("(?i)[^aeiou]", "").length();
                String VowelCountString = Integer.toString(VowelCount);
                CountVowelStringResult.setText(VowelCountString);
            }
        });
    }
}