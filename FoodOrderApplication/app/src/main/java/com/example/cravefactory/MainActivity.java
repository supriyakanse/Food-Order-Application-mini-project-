package com.example.cravefactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    int [] pic={R.drawable.r1,R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5,
            R.drawable.r6,R.drawable.r7,R.drawable.r8,R.drawable.r9,R.drawable.r10};
    String [] foodNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodNames=getResources().getStringArray(R.array.food);
        gridView=(GridView)findViewById(R.id.gridViewId);


        CustomAdapter adapter=new CustomAdapter(this,foodNames,pic);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(MainActivity.this, FirstActivity.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent=new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent=new Intent(MainActivity.this, FourthActivity.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent=new Intent(MainActivity.this, FifthActivity.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent=new Intent(MainActivity.this, SixthActivity.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent=new Intent(MainActivity.this, SeventhActivity.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent=new Intent(MainActivity.this,EightActivity.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent=new Intent(MainActivity.this, NinethActivity.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent=new Intent(MainActivity.this, TenthActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}