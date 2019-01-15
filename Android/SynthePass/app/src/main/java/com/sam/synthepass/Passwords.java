package com.sam.synthepass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Passwords extends AppCompatActivity {
    private Button loButton;
    private String appOne;
    private String passwordOne;

    public String getAppOne() {
        return appOne;
    }

    public void setAppOne(String appOne) {
        this.appOne = appOne;
    }
    public String getPasswordOne() {
        return passwordOne;
    }

    public void setPasswordOne(String appOne) {
        this.passwordOne = passwordOne;
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);
        loButton = findViewById(R.id.loButton);


        View.OnClickListener onloButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                Intent first = new Intent(Passwords.this, Synthesizer.class);
                Passwords.this.startActivity(first);
            }
        };
        loButton.setOnClickListener(onloButtonClick);

    }
    public Passwords(){
        appOne = "app";
        passwordOne = "password";
    }





}
