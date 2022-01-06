package com.example.exercise8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnplus,btnminus;
    TextView count,reset;
    int mycount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplus =(Button)findViewById(R.id.plus);
        btnminus =(Button)findViewById(R.id.minus);
        count=(TextView)findViewById(R.id.textvalue);
        reset=(TextView)findViewById(R.id.reset);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mycount++;
                count.setText(mycount + "");

            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount--;
                count.setText(mycount + "");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mycount=0;
                count.setText(mycount + "");
            }
        });
    }}
