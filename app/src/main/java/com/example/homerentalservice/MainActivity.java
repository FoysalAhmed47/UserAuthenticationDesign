package com.example.homerentalservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etPhone,etPassword;
    TextView tvRegister;
    Button Loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhone=(EditText)findViewById(R.id.login_userphone_input);
        etPassword=(EditText)findViewById(R.id.login_password_input);
        Loginbtn=(Button)findViewById(R.id.login_btn);
        tvRegister=(TextView)findViewById(R.id.usrRegtxt);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
