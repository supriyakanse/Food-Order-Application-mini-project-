package com.example.cravefactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void Next(View view) {
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}