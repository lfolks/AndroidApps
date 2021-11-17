package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    EditText name, id, address;
    TextView NameErr, IDErr, AddressErr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG, "onCreate: MainAct2 Started");

        name = (EditText)findViewById(R.id.CustomerName);
        id = (EditText)findViewById(R.id.CustomerID);
        address = (EditText)findViewById(R.id.CustomerAddress);
        NameErr = (TextView)findViewById(R.id.NameErr);
        IDErr = (TextView)findViewById(R.id.IDErr);
        AddressErr = (TextView)findViewById(R.id.AddressErr);
        Button Submit_Btn = findViewById(R.id.SubmitBtn);

        Submit_Btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty()){
                    NameErr.setText("Enter Customer Name");
                }else {
                    if(name.getText().toString().matches("[a-zA-Z]+")){
                        NameErr.setText("Name: " + name.getText().toString());
                    }else{
                        NameErr.setText("Customer Name Can Not Contain Numbers");
                    }

                }

                if(id.getText().toString().isEmpty()){
                    IDErr.setText("Enter Customer ID");
                }else{
                    IDErr.setText("Customer ID: " + id.getText().toString());
                }

                if(address.getText().toString().isEmpty()){
                    AddressErr.setText("Enter Customer Address");
                }else{
                    AddressErr.setText("Customer Address: " + address.getText().toString());
                }
            }
        });

        Button homePage = findViewById(R.id.Home);
        Button orderPage = findViewById(R.id.Order);

        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked MainAct2 homePage");

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        orderPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked MainAct2 orderPage");

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}