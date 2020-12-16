package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity{
    private EditText txtEmail;
    private  EditText txtPassword;
    private Button  btnLogin;
    private WifiManager wifiManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String email = txtEmail.getText().toString().trim();
           String password = txtPassword.getText().toString();

            }
        });

    }


}