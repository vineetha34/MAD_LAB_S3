package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void handleradiobutton(View view)
        {
            boolean checked=((RadioButton)view ).isChecked();
            switch(view.getId())
            {
                case R.id.radiom:
                    if(checked){
                        showmessage("selected male");

                    }
                    break;
                case R.id.radiof:
                    if(checked)
                    {
                        showmessage("selected female");
                    }
                    break;
            }
        }
        public void showmessage(String message)
        {
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        }
    }
