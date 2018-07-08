package com.hamza.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText inputUserName;
    EditText inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        inputUserName = (EditText) findViewById(R.id.username);
        inputPassword = (EditText) findViewById(R.id.password);
    }


    @Override
    public void onClick(View view) {
        String username = inputUserName.getText().toString();
        String password = inputPassword.getText().toString();
        Toast.makeText(MainActivity.this, username+" "+password+" was entered", Toast.LENGTH_SHORT).show();
    }
}
