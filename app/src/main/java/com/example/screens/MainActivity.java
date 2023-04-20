package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText pancakeType;
    EditText pancakeAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pancakeType=findViewById(R.id.editTextPancakeType);
        pancakeAmount=findViewById(R.id.editTextPancakeAmount);
        button = findViewById(R.id.switchActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                String editT = pancakeType.getText().toString();
                String editA = pancakeAmount.getText().toString();

                intent.putExtra("Pancake type", editT);
                intent.putExtra("amount", editA);
                startActivity(intent);
            }
        });
    }

}
