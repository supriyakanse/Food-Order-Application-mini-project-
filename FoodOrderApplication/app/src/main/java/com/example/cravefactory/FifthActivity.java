package com.example.cravefactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cravefactory.R;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        getSupportActionBar().hide();
    }
    public void OrderNow(View view) {
        Intent i=new Intent(getApplicationContext(),OrderActivity.class);
        startActivity(i);
    }
}