package com.example.amitabh.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextPage extends AppCompatActivity {

    public TextView text;
    private int a=0;
    public Button plusButton,minusButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_page);
        text=findViewById(R.id.textTV);
        plusButton=findViewById(R.id.plusBtn);
        minusButton=findViewById(R.id.minusBtn);
        //String name=getIntent().getStringExtra("key");

        //text.setText("Hello  "+name+"  !!");
    }

    public void plus(View view) {

        a++;
        text.setText(Integer.toString(a));


    }

    public void minus(View view) {

        a--;
        text.setText(Integer.toString(a));

    }
}
