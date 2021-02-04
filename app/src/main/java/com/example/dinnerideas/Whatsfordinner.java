package com.example.dinnerideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Whatsfordinner extends AppCompatActivity {
    Button btn3;

       @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsfordinner);

        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent from this activity to Random.
                Intent intent = new Intent(Whatsfordinner.this, Random.class);
                startActivity(intent);
            }
        });

    }
}