package com.example.mb;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class FirstPage extends AppCompatActivity {

    EditText userName, userpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        userName = findViewById(R.id.uname);
        userpassword = findViewById(R.id.password);
    }

    public void login(View v) {
        String uName = userName.getText().toString();
        String uPassword = userpassword.getText().toString();
        if (uName.equals("admin") && uPassword.equals("MovieBox")) {
            Intent i = new Intent(this, AdminPannel.class);
            startActivity(i);
        } else if (uName.equals("") && uPassword.equals("")) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(FirstPage.this, "Username or Password is incorrect", Toast.LENGTH_LONG).show();
        }

    }
}


