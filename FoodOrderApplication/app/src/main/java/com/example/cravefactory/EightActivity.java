package com.example.cravefactory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cravefactory.R;

public class EightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        getSupportActionBar().hide();
        AlertDialog alertDialog1= new AlertDialog.Builder(EightActivity.this).create();
        alertDialog1.setTitle("VeGGie??");
        alertDialog1.setMessage("Hey User..Careful if you are VEGGIE it is not for you..!!!");
        alertDialog1.setButton(Dialog.BUTTON_POSITIVE, "Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Okay Go Ahead..!!!",Toast.LENGTH_LONG).show();
            }
        });
        alertDialog1.show();
    }
    public void OrderNow(View view) {
        Intent i=new Intent(getApplicationContext(),OrderActivity.class);
        startActivity(i);
    }

}