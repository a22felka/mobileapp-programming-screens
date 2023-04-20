package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    public String pancakeType;
    public String pancakeAmount;
    private TextView typ;
    private TextView mengd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        typ = findViewById(R.id.extraString);
        mengd = findViewById(R.id.extraString2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String pancakeType = extras.getString("Pancake type");
            pancakeAmount = extras.getString("amount");

            typ.setText(pancakeType);
            mengd.setText(pancakeAmount);
        }
    }
}