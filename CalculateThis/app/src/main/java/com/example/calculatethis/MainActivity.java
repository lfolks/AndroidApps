package com.example.calculatethis;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    double Number1, Number2;
    EditText Num1, Num2;
    TextView CalcModResult, CalcAddResult, CalcSubResult, CalcDivResult, CalcPowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.NumberOne);
        Num2 = findViewById(R.id.NumberTwo);

        CalcModResult = findViewById(R.id.CalcModResult);
        CalcAddResult = findViewById(R.id.CalcAddResult);
        CalcSubResult = findViewById(R.id.CalcSubResult);
        CalcDivResult = findViewById(R.id.CalcDivResult);
        CalcPowResult = findViewById(R.id.CalcPowResult);

        Button CalcMod = findViewById(R.id.CalcMod);
        Button CalcAdd = findViewById(R.id.CalcAdd);
        Button CalcSub = findViewById(R.id.CalcSub);
        Button CalcDiv = findViewById(R.id.CalcDiv);
        Button CalcPow = findViewById(R.id.CalcPow);

        CalcMod.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(Num1.getText().toString().isEmpty()){
                    CalcModResult.setText("First number is empty.");
                }else{
                    if(Num2.getText().toString().isEmpty()){
                        CalcModResult.setText("Second number is empty.");
                    }else{
                        Number1 = Double.parseDouble(Num1.getText().toString());
                        Number2 = Double.parseDouble(Num2.getText().toString());
                        double MODresult = Number1 % Number2;
                        CalcModResult.setText("" + MODresult);
                    }
                }
            }
        });

        CalcAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(Num1.getText().toString().isEmpty()){
                    CalcAddResult.setText("First number is empty.");
                }else{
                    if(Num2.getText().toString().isEmpty()){
                        CalcAddResult.setText("Second number is empty.");
                    }else{
                        Number1 = Double.parseDouble(Num1.getText().toString());
                        Number2 = Double.parseDouble(Num2.getText().toString());
                        double ADDresult = Number1 + Number2;
                        CalcAddResult.setText("" + ADDresult);
                    }
                }
            }
        });

        CalcSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(Num1.getText().toString().isEmpty()){
                    CalcSubResult.setText("First number is empty.");
                }else{
                    if(Num2.getText().toString().isEmpty()){
                        CalcSubResult.setText("Second number is empty.");
                    }else{
                        Number1 = Double.parseDouble(Num1.getText().toString());
                        Number2 = Double.parseDouble(Num2.getText().toString());
                        double SUBresult = Number1 - Number2;
                        CalcSubResult.setText("" + SUBresult);
                    }
                }
            }
        });

        CalcDiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(Num1.getText().toString().isEmpty()){
                    CalcDivResult.setText("First number is empty.");
                }else{
                    if(Num2.getText().toString().isEmpty()){
                        CalcDivResult.setText("Second number is empty.");
                    }else{
                        Number1 = Double.parseDouble(Num1.getText().toString());
                        Number2 = Double.parseDouble(Num2.getText().toString());
                        double DIVresult = Number1 / Number2;
                        CalcDivResult.setText("" + DIVresult);
                    }
                }
            }
        });

        CalcPow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(Num1.getText().toString().isEmpty()){
                    CalcPowResult.setText("First number is empty.");
                }else{
                    if(Num2.getText().toString().isEmpty()){
                        CalcPowResult.setText("Second number is empty.");
                    }else{
                        Number1 = Double.parseDouble(Num1.getText().toString());
                        Number2 = Double.parseDouble(Num2.getText().toString());
                        double POWresult = Math.pow(Number1, Number2);
                        CalcPowResult.setText("" + POWresult);
                    }
                }
            }
        });



        /*
        CalcMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().isEmpty() || Num2.getText().toString().isEmpty()){
                    Num1.setText("0");
                    Num2.setText("0");

                    CalcModResult = NumOne % NumTwo;
                }
            }
        });
        */
    }
}