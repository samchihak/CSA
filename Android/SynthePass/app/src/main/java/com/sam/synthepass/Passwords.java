package com.sam.synthepass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class Passwords extends AppCompatActivity {
    private Button loButton;
    private EditText appOne;
    private EditText pwOne;
    private EditText appTwo;
    private EditText pwTwo;
    private EditText appThree;
    private EditText pwThree;
    /*private String appOne;
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
    */


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);
        loButton = findViewById(R.id.loButton);
        appOne = findViewById(R.id.appOne);
        appTwo = findViewById(R.id.appTwo);
        appThree = findViewById(R.id.appThree);
        pwOne = findViewById(R.id.pwOne);
        pwTwo = findViewById(R.id.pwTwo);
        pwThree = findViewById(R.id.pwThree);




        View.OnClickListener onloButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                Intent first = new Intent(Passwords.this, Synthesizer.class);
                Passwords.this.startActivity(first);
            }
        };
        loButton.setOnClickListener(onloButtonClick);

    }
    public Passwords(){

        Password passwordOne = new Password();
        passwordOne.setApp("Mail");
        passwordOne.setPassword("Password123");

        Backendless.Data.of(Password.class).save(passwordOne, new AsyncCallback<Password>() {
            @Override
            public void handleResponse(Password response) {

            }

            @Override
            public void handleFault(BackendlessFault fault) {

            }
        });
    }





}
