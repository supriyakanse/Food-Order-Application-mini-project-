package com.example.cravefactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().hide();//is use to hide app bar
    }

    public void OrderNow(View view) {
        Intent i=new Intent(getApplicationContext(),OrderActivity.class);
        startActivity(i);
    }
}