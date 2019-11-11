package com.example.amitabh.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText username;
    public EditText password;
    public Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.userET);
        password=findViewById(R.id.passET);
        login=findViewById(R.id.loginBtn);
    }

    public void login(View view) {
        String name=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        Intent intent=new Intent(MainActivity.this,TextPage.class);
        if(pass.equals("123456") && (name.equals("admin")))
        {
            intent.putExtra("key",name);
            startActivity(intent);
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_SHORT).show();
        }
    }
}
