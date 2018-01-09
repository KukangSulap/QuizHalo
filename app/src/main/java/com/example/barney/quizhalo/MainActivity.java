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
    String h = "txt7";
    String i = "txt8";

    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
