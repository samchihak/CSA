package com.sam.synthepass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_open);
        foButton = findViewById(R.id.foButton);
        noButton = findViewById(R.id.noButton);
        noPass = findViewById(R.id.noPass);
        //userSynthPass = new File("userSynthPass");
        userSynthPass = new File(this.getFilesDir(), "userSynthPass");
        try {
            userSynthPass.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            android.util.Log.d("log", "File not created: " + e.getMessage());
        }
        try {
            synthPass = readFileToString(userSynthPass);
            synthHolder.getInstance().setSynthPass(synthPass);
        } catch (FileNotFoundException e) {
            android.util.Log.d("log", "File not found: " + e.getMessage());
        } catch (IOException e) {
            android.util.Log.d("log", "Error accessing file: " + e.getMessage());
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

        }



    }
