package com.example.a2018abutler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a2018abutler.guilab.R;

public class Main2Activity extends AppCompatActivity {

    int count1;
    int count2;
    int count3;
    int count4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        TextView textView = (TextView) findViewById(R.id.tv1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"Text View Pressed", Toast.LENGTH_SHORT).show();
                count1++;
                Log.i("onCreate","TextViewPressed " + count1 + "times" );

            }
        });
        TextView textView2 = (TextView) findViewById(R.id.tv2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"Text View Pressed", Toast.LENGTH_SHORT).show();
                count2++;
                Log.i("onCreate","TextViewPressed " + count2 + "times" );

            }
        });
        TextView textView3 = (TextView) findViewById(R.id.tv3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"Text View Pressed", Toast.LENGTH_SHORT).show();
                count3++;
                Log.i("onCreate","TextViewPressed " + count3 + "times" );

            }
        });
        TextView textView4 = (TextView) findViewById(R.id.tv4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"Text View Pressed", Toast.LENGTH_SHORT).show();
                count4++;
                Log.i("onCreate","TextViewPressed " + count4 + "times" );

            }
        });
    }
}
