package com.example.barney.quizhalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String a = "txt1";
    String b = "txt2";
    String c = "txt3";
    String d = "txt4";
    String e = "txt5";
    String f = "txt6";
    String g = "txt7";
    String h = "txt8";

    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        txt6 = (TextView) findViewById(R.id.txt6);
        txt7 = (TextView) findViewById(R.id.txt7);
        txt8 = (TextView) findViewById(R.id.txt8);


        txt1.setText(a);
        txt2.setText(b);
        txt3.setText(c);
        txt4.setText(d);
        txt5.setText(e);
        txt6.setText(f);
        txt7.setText(g);
        txt8.setText(h);
    }
}
