package com.example.cravefactory;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.se.omapi.Session;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity
{
    EditText email;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        email=(EditText)findViewById(R.id.EmailAdd);
        order=(Button) findViewById(R.id.orderbutton);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderActivity.this,"Thank you for choosing us!",Toast.LENGTH_LONG).show();
                final ProgressDialog dialog = new ProgressDialog(OrderActivity.this);
                dialog.setTitle("Processing Order");
                dialog.setMessage("Please wait");
                dialog.show();
                Thread sender = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            GMailSender sender = new GMailSender("shrutikak843@gmail.com", "skanse@94");
                            sender.sendMail("CraveFactory App", "Thank you for your order,Do visit again!",
                                    "shrutikak843@gmail.com",
                                    email.getText().toString());
                            dialog.dismiss();
                        } catch (Exception e) {
                            Log.e("mylog", "Error: " + e.getMessage());
                            Toast.makeText(OrderActivity.this,"Error",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                sender.start();
            }

        });

    }


}
