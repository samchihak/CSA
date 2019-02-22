package com.sam.synthepass;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class Passwords extends AppCompatActivity {
    Button loButton;
    ImageButton saveOne, saveTwo, saveThree, saveFour, saveFive;
    EditText appOne, appTwo, appThree, appFour, appFive, pwOne, pwTwo, pwThree, pwFour, pwFive;
    public Passwords(){


    }

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
    private boolean connectionAvailable(){

        boolean connected = false;

        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork!=null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                connected = true;
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                connected = true;
            }
        }
        else {
            connected = false;
        }
        return connected;

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);
        loButton = findViewById(R.id.loButton);
        saveOne = findViewById(R.id.saveOne);
        saveTwo = findViewById(R.id.saveTwo);
        saveThree = findViewById(R.id.saveThree);
        saveFour = findViewById(R.id.saveFour);
        saveFive = findViewById(R.id.saveFive);
        appOne = findViewById(R.id.appOne);
        appTwo = findViewById(R.id.appTwo);
        appThree = findViewById(R.id.appThree);
        appFour = findViewById(R.id.appFour);
        appFive = findViewById(R.id.appFive);
        pwOne = findViewById(R.id.pwOne);
        pwTwo = findViewById(R.id.pwTwo);
        pwThree = findViewById(R.id.pwThree);
        pwFour = findViewById(R.id.pwFour);
        pwFive = findViewById(R.id.pwFive);

        View.OnClickListener onloButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                Intent first = new Intent(Passwords.this, Synthesizer.class);
                Passwords.this.startActivity(first);
            }
        };
        loButton.setOnClickListener(onloButtonClick);

        View.OnClickListener onSaveOneClick = new View.OnClickListener() {
            String a1 = appOne.getText().toString().trim();
            String p1 = pwOne.getText().toString().trim();

            @Override
            public void onClick(View v) {
                if (connectionAvailable()) {
                    if (a1.length() > 0 && p1.length() > 0) {
                        passwordOne passwordOne = new passwordOne();
                        passwordOne.setApp(a1);
                        passwordOne.setPassword(p1);
                        Backendless.Data.of(passwordOne.class).save(passwordOne, new AsyncCallback<passwordOne>() {
                            @Override
                            public void handleResponse(passwordOne response) {

                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {

                            }
                        });
                    }
                    Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Passwords.this, "Please connect to internet to save", Toast.LENGTH_SHORT).show();
                }
            }

        };
        saveOne.setOnClickListener(onSaveOneClick);
        View.OnClickListener onSaveTwoClick = new View.OnClickListener() {

            String a2 = appTwo.getText().toString().trim();
            String p2 = pwTwo.getText().toString().trim();

            @Override
            public void onClick(View v) {
                if (connectionAvailable()) {
                    if (a2.length() > 0 && p2.length() > 0) {
                        passwordTwo passwordTwo = new passwordTwo();
                        passwordTwo.setApp(a2);
                        passwordTwo.setPassword(p2);
                        Backendless.Data.of(passwordTwo.class).save(passwordTwo, new AsyncCallback<passwordTwo>() {
                            @Override
                            public void handleResponse(passwordTwo response) {

                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {

                            }
                        });
                    }
                    Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Passwords.this, "Please connect to internet to save", Toast.LENGTH_SHORT).show();
                }
            }

        };
        saveTwo.setOnClickListener(onSaveTwoClick);
        View.OnClickListener onSaveThreeClick = new View.OnClickListener() {
            String a3 = appThree.getText().toString().trim();
            String p3 = pwThree.getText().toString().trim();

            @Override
            public void onClick(View v) {
                if (connectionAvailable()) {
                    if (a3.length() > 0 && p3.length() > 0) {
                        passwordThree passwordThree = new passwordThree();
                        passwordThree.setApp(a3);
                        passwordThree.setPassword(p3);
                        Backendless.Data.of(passwordThree.class).save(passwordThree, new AsyncCallback<passwordThree>() {

                            @Override
                            public void handleResponse(com.sam.synthepass.passwordThree response) {

                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {

                            }
                        });
                    }
                    Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Passwords.this, "Please connect to internet to save", Toast.LENGTH_SHORT).show();
                }
            }

        };
        saveThree.setOnClickListener(onSaveThreeClick);
        View.OnClickListener onSaveFourClick = new View.OnClickListener() {
            String a4 = appFour.getText().toString().trim();
            String p4 = pwFour.getText().toString().trim();
            @Override
            public void onClick(View v) {
                if (connectionAvailable()) {
                    if (a4.length() > 0 && p4.length() > 0) {
                        passwordFour passwordFour = new passwordFour();
                        passwordFour.setApp(a4);
                        passwordFour.setPassword(p4);
                        Backendless.Data.of(passwordFour.class).save(passwordFour, new AsyncCallback<passwordFour>() {

                            @Override
                            public void handleResponse(com.sam.synthepass.passwordFour response) {

                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {

                            }
                        });
                    }
                    Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Passwords.this, "Please connect to internet to save", Toast.LENGTH_SHORT).show();
                }

            }
        };
        saveFour.setOnClickListener(onSaveFourClick);
        View.OnClickListener onSaveFiveClick = new View.OnClickListener() {

            String a5 = appFive.getText().toString().trim();
            String p5 = pwFive.getText().toString().trim();
            @Override
            public void onClick(View v) {
                if (connectionAvailable()) {
                    if (a5.length() > 0 && p5.length() > 0) {
                        passwordFive passwordFive = new passwordFive();
                        passwordFive.setApp(a5);
                        passwordFive.setPassword(p5);
                        Backendless.Data.of(passwordFive.class).save(passwordFive, new AsyncCallback<passwordFive>() {

                            @Override
                            public void handleResponse(com.sam.synthepass.passwordFive response) {

                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {

                            }
                        });
                    }
                    Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Passwords.this, "Please connect to internet to save", Toast.LENGTH_SHORT).show();
                }

            }
        };
        saveFive.setOnClickListener(onSaveFiveClick);
    }



}
