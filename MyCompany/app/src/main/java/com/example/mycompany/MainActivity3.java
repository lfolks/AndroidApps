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

public class MainActivity3 extends AppCompatActivity {

    private static final String TAG = "MainActivity3";

    EditText orderID, orderName, orderQuantity, orderFulfilledBy;
    TextView OrderIDErr, OrderNameErr, OrderQuantityErr, OrderFulfilledByErr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.d(TAG, "onCreate: MainAct3 Started");

        orderID = (EditText)findViewById(R.id.CustomerOrderID);
        orderName = (EditText)findViewById(R.id.OrderName);
        orderQuantity = (EditText)findViewById(R.id.OrderQuantity);
        orderFulfilledBy = (EditText)findViewById(R.id.OrderFulfilledBy);
        OrderIDErr = (TextView)findViewById(R.id.OrderIDErr);
        OrderNameErr = (TextView)findViewById(R.id.OrderNameErr);
        OrderQuantityErr = (TextView)findViewById(R.id.OrderQuantityErr);
        OrderFulfilledByErr = (TextView)findViewById(R.id.OrderFulfilledByErr);
        Button Submit_Btn = findViewById(R.id.SubmitBtn);

        Submit_Btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(orderID.getText().toString().isEmpty()){
                    OrderIDErr.setText("Enter Customer Order ID");
                }else{
                    OrderIDErr.setText("Customer Order ID: " + orderID.getText().toString());
                }

                if(orderName.getText().toString().isEmpty()){
                    OrderNameErr.setText("Enter Order Name");
                }else {
                    if(orderName.getText().toString().matches("[a-zA-Z]+")){
                        OrderNameErr.setText("Order Name: " + orderName.getText().toString());
                    }else{
                        OrderNameErr.setText("Order Name Can Not Contain Numbers");
                    }
                }

                if(orderQuantity.getText().toString().isEmpty()){
                    OrderQuantityErr.setText("Enter Order Quantity");
                }else{
                    if(orderQuantity.getText().toString().matches("[0-9]+")){
                        OrderQuantityErr.setText("Customer Address: " + orderQuantity.getText().toString());
                    }else{
                        OrderQuantityErr.setText("Order Quantity Must Contain Whole Numbers");
                    }
                }

                if(orderFulfilledBy.getText().toString().isEmpty()){
                    OrderFulfilledByErr.setText("Enter Who Fulfilled The Order");
                }else {
                    if(orderFulfilledBy.getText().toString().matches("[a-zA-Z ]+")){
                        OrderFulfilledByErr.setText("Order Fulfilled By: " + orderFulfilledBy.getText().toString());
                    }else{
                        OrderFulfilledByErr.setText("Name Can Not Contain Numbers");
                    }
                }
            }
        });

        Button homePage = findViewById(R.id.Home);
        Button customerPage = findViewById(R.id.Customer);

        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked MainAct2 homePage");

                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        customerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked MainAct3 customerPage");

                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}