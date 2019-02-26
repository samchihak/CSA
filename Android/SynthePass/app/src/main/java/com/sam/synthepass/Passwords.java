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
import android.widget.TextView;
import android.widget.Toast;


import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class Passwords extends AppCompatActivity {
    Button loButton, retPassButton;
    ImageButton saveOne, saveTwo, saveThree, saveFour, saveFive;
    EditText appOne, appTwo, appThree, appFour, appFive, pwOne, pwTwo, pwThree, pwFour, pwFive;
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
        assert cm != null;
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork!=null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                connected = true;
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                connected = true;
            }
        }
        return connected;

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);

        loButton = findViewById(R.id.loButton);
        retPassButton = findViewById(R.id.retPassButton);

        saveOne = findViewById(R.id.saveOne);
        saveTwo = findViewById(R.id.saveTwo);
        saveThree = findViewById(R.id.saveThree);
        saveFour = findViewById(R.id.saveFour);
        saveFive = findViewById(R.id.saveFive);

        View.OnClickListener onloButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                Intent first = new Intent(Passwords.this, Synthesizer.class);
                Passwords.this.startActivity(first);
            }
        };
        loButton.setOnClickListener(onloButtonClick);

        View.OnClickListener onSaveOneClick = new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                appOne = findViewById(R.id.appOne);
                pwOne = findViewById(R.id.pwOne);
                String a1 = appOne.getText().toString();
                String p1 = pwOne.getText().toString();
                if (connectionAvailable() && a1.length() > 0 && p1.length() > 0) {
                        passwordOne password = new passwordOne();
                        password.setApp(a1);
                        password.setPassword(p1);
                        Backendless.Persistence.save(password, new AsyncCallback<passwordOne>() {
                            @Override
                            public void handleResponse(passwordOne response) {
                                Toast.makeText(Passwords.this, "Password Saved", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {
                                Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                }
                else{
                    Toast.makeText(Passwords.this, "Not saved: Enter App/Password and check connection.", Toast.LENGTH_SHORT).show();
                }
            }

        };
        saveOne.setOnClickListener(onSaveOneClick);

        View.OnClickListener onSaveTwoClick = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                appTwo = findViewById(R.id.appTwo);
                pwTwo = findViewById(R.id.pwTwo);
                String a2 = appTwo.getText().toString().trim();
                String p2 = pwTwo.getText().toString().trim();
                if (connectionAvailable() && a2.length() > 0 && p2.length() > 0) {
                        passwordTwo passwordTwo = new passwordTwo();
                        passwordTwo.setApp(a2);
                        passwordTwo.setPassword(p2);
                        Backendless.Persistence.save(passwordTwo, new AsyncCallback<passwordTwo>() {
                            @Override
                            public void handleResponse(passwordTwo response) {
                                Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {
                                Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                }
                else{
                    Toast.makeText(Passwords.this, "Not saved: Enter App/Password and check connection.", Toast.LENGTH_SHORT).show();
                }
            }

        };
        saveTwo.setOnClickListener(onSaveTwoClick);

        View.OnClickListener onSaveThreeClick = new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                appThree = findViewById(R.id.appThree);
                pwThree = findViewById(R.id.pwThree);
                String a3 = appThree.getText().toString().trim();
                String p3 = pwThree.getText().toString().trim();
                if (connectionAvailable() && a3.length() > 0 && p3.length() > 0) {
                        passwordThree passwordThree = new passwordThree();
                        passwordThree.setApp(a3);
                        passwordThree.setPassword(p3);
                        Backendless.Persistence.save(passwordThree, new AsyncCallback<passwordThree>() {

                            @Override
                            public void handleResponse(com.sam.synthepass.passwordThree response) {
                                Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {
                                Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                }
                else{
                    Toast.makeText(Passwords.this, "Not saved: Enter App/Password and check connection.", Toast.LENGTH_SHORT).show();
                }
            }

        };
        saveThree.setOnClickListener(onSaveThreeClick);

        View.OnClickListener onSaveFourClick = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                appFour = findViewById(R.id.appFour);
                pwFour = findViewById(R.id.pwFour);
                String a4 = appFour.getText().toString().trim();
                String p4 = pwFour.getText().toString().trim();
                if (connectionAvailable() && a4.length() > 0 && p4.length() > 0) {
                        passwordFour passwordFour = new passwordFour();
                        passwordFour.setApp(a4);
                        passwordFour.setPassword(p4);
                        Backendless.Persistence.save(passwordFour, new AsyncCallback<passwordFour>() {

                            @Override
                            public void handleResponse(com.sam.synthepass.passwordFour response) {
                                Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {
                                Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                }
                else{
                    Toast.makeText(Passwords.this, "Not saved: Enter App/Password and check connection.", Toast.LENGTH_SHORT).show();
                }

            }
        };
        saveFour.setOnClickListener(onSaveFourClick);

        View.OnClickListener onSaveFiveClick = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                appFive = findViewById(R.id.appFive);
                pwFive = findViewById(R.id.pwFive);
                String a5 = appFive.getText().toString().trim();
                String p5 = pwFive.getText().toString().trim();
                if (connectionAvailable() && a5.length() > 0 && p5.length() > 0) {
                        passwordFive passwordFive = new passwordFive();
                        passwordFive.setApp(a5);
                        passwordFive.setPassword(p5);
                        Backendless.Persistence.save(passwordFive, new AsyncCallback<passwordFive>() {

                            @Override
                            public void handleResponse(com.sam.synthepass.passwordFive response) {
                                Toast.makeText(Passwords.this, "Passwords Saved", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void handleFault(BackendlessFault fault) {
                                Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                }
                else{
                    Toast.makeText(Passwords.this, "Not saved: Enter App/Password and check connection.", Toast.LENGTH_SHORT).show();
                }

            }
        };
        saveFive.setOnClickListener(onSaveFiveClick);
        View.OnClickListener onretPassButtonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Backendless.Data.of( passwordOne.class).findLast(new AsyncCallback<passwordOne>() {
                    @Override
                    public void handleResponse(passwordOne response) {
                        appOne = findViewById(R.id.appOne);
                        pwOne = findViewById(R.id.pwOne);
                        appOne.setText(response.getApp(), TextView.BufferType.EDITABLE);
                        pwOne.setText(response.getPassword(), TextView.BufferType.EDITABLE);
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
                Backendless.Data.of( passwordTwo.class).findLast(new AsyncCallback<passwordTwo>() {
                    @Override
                    public void handleResponse(passwordTwo response) {
                        appTwo = findViewById(R.id.appTwo);
                        pwTwo = findViewById(R.id.pwTwo);
                        appTwo.setText(response.getApp(), TextView.BufferType.EDITABLE);
                        pwTwo.setText(response.getPassword(), TextView.BufferType.EDITABLE);
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
                Backendless.Data.of( passwordThree.class).findLast(new AsyncCallback<passwordThree>() {
                    @Override
                    public void handleResponse(passwordThree response) {
                        appThree = findViewById(R.id.appThree);
                        pwThree = findViewById(R.id.pwThree);
                        appThree.setText(response.getApp(), TextView.BufferType.EDITABLE);
                        pwThree.setText(response.getPassword(), TextView.BufferType.EDITABLE);
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
                Backendless.Data.of( passwordFour.class).findLast(new AsyncCallback<passwordFour>() {
                    @Override
                    public void handleResponse(passwordFour response) {
                        appFour = findViewById(R.id.appFour);
                        pwFour = findViewById(R.id.pwFour);
                        appFour.setText(response.getApp(), TextView.BufferType.EDITABLE);
                        pwFour.setText(response.getPassword(), TextView.BufferType.EDITABLE);
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
                Backendless.Data.of( passwordFive.class).findLast(new AsyncCallback<passwordFive>() {
                    @Override
                    public void handleResponse(passwordFive response) {
                        appFive = findViewById(R.id.appFive);
                        pwFive = findViewById(R.id.pwFive);
                        appFive.setText(response.getApp(), TextView.BufferType.EDITABLE);
                        pwFive.setText(response.getPassword(), TextView.BufferType.EDITABLE);
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(Passwords.this, fault.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

            }
        };
        retPassButton.setOnClickListener(onretPassButtonClick);

    }



}
