package com.sam.synthepass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.backendless.BackendlessUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.readFileToString;

public class FirstOpen extends AppCompatActivity {
    private Button foButton;
    private Button noButton;
    private String synthPass;
    private View noPass;
    private File userSynthPass;
    private Button dspButton;
    private View dspWarning;
    private FloatingActionButton farButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_open);
        foButton = findViewById(R.id.foButton);
        noButton = findViewById(R.id.noButton);
        noPass = findViewById(R.id.noPass);
        dspButton = findViewById(R.id.dspButton);
        dspWarning = findViewById(R.id.dspWarning);
        farButton = findViewById(R.id.farButton);
        //userSynthPass = new File("userSynthPass");
        userSynthPass = new File(this.getFilesDir(), "userSynthPass");
        try {
            userSynthPass.createNewFile();
            android.util.Log.d("log", "File created at " + " " + userSynthPass.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            android.util.Log.d("log", "File not created: " + e.getMessage());
        }
        try {
            synthPass = readFileToString(userSynthPass);
            android.util.Log.d("log", "File at " + " " + userSynthPass.getAbsolutePath());
            synthHolder.getInstance().setSynthPass(synthPass);
        } catch (FileNotFoundException e) {
            android.util.Log.d("log", "File not found: " + e.getMessage());
        } catch (IOException e) {
            android.util.Log.d("log", "Error accessing file: " + e.getMessage());
        }
        if(synthPass!=""){
            foButton.setVisibility(View.INVISIBLE);
            noButton.setVisibility(View.VISIBLE);
            dspButton.setVisibility(View.VISIBLE);
        }
        else{
            foButton.setVisibility(View.VISIBLE);
            noButton.setVisibility(View.INVISIBLE);
            dspButton.setVisibility(View.INVISIBLE);
        }
        View.OnClickListener onfoButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                Intent first = new Intent(FirstOpen.this, firstSynth.class);
                FirstOpen.this.startActivity(first);

            }
        };
        foButton.setOnClickListener(onfoButtonClick);

        View.OnClickListener onnoButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                if(synthPass!=null) {
                    if (synthPass.length() != 0) {
                        Intent next = new Intent(FirstOpen.this, Synthesizer.class);
                        FirstOpen.this.startActivity(next);
                        android.util.Log.d("log", "FINDME password is" + " " + synthPass);
                    }
                    else{
                        noPass.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    noPass.setVisibility(View.VISIBLE);
                }
            }
        };
        noButton.setOnClickListener(onnoButtonClick);
        View.OnClickListener ondspButtonClick = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(dspWarning.getVisibility() == View.VISIBLE ){
                deleteFile("userSynthPass");
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                }
                else{
                    dspWarning.setVisibility(View.VISIBLE);
                }

            }
        };
        dspButton.setOnClickListener(ondspButtonClick);
        View.OnClickListener onfarButtonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOne = getIntent();
                finish();
                startActivity(intentOne);
            }
        };
        farButton.setOnClickListener(onfarButtonClick);
        }




    }
