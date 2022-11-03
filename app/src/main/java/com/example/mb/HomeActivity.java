package com.example.mb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class HomeActivity extends AppCompatActivity {

    Button btn1;
    Button btnfd;
    Button btnpay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1=findViewById(R.id.btn1);
        btnfd=findViewById(R.id.btnfd);
        btnpay=findViewById(R.id.btnpay);
        final Intent chooser;

        Intent i1=new Intent(Intent.ACTION_SEND);

        i1.setData(Uri.parse("mailto:"));

        i1.putExtra(Intent.EXTRA_EMAIL,new String[] {"movieboxb8@gmail.com"});
        i1.putExtra(Intent.EXTRA_SUBJECT,"Enter your subject");
        i1.putExtra(Intent.EXTRA_TEXT,"Enter your body");

        i1.setType("text/plain");

        chooser =Intent.createChooser(i1,"Choose a sutiable app to send an Email");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(chooser);
            }
        });

        btnfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), view.class);
                startActivity(intent);
            }
        });
        btnpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), payment.class);
                startActivity(intent);
            }
        });

    }
}