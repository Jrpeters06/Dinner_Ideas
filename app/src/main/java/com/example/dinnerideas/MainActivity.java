package com.example.dinnerideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find our button. It's just a regular button center in the screen.
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        //Set an onClickListener to detect clicks.
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent from this activity to Whatsfordinner.
                Intent intent = new Intent(MainActivity.this, Whatsfordinner.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent from this activity to PickAndChose.
                Intent intent = new Intent(MainActivity.this, PickAndChoose.class);
                startActivity(intent);
            }
        });
    }
}
