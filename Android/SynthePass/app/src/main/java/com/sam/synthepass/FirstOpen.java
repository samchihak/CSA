package com.sam.synthepass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstOpen extends AppCompatActivity {
    private Button foButton;
    private Button noButton;
    private String synthPass = synthHolder.getInstance().getSynthPass();
    private View noPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_open);
        foButton = findViewById(R.id.foButton);
        noButton = findViewById(R.id.noButton);
        noPass = findViewById(R.id.noPass);

        View.OnClickListener onfoButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                Intent first = new Intent(FirstOpen.this, firstSynth.class);
                FirstOpen.this.startActivity(first);
            }
        };
        foButton.setOnClickListener(onfoButtonClick);

        View.OnClickListener onnoButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                if(synthPass!=null){
                    Intent next = new Intent(FirstOpen.this, Synthesizer.class);
                    FirstOpen.this.startActivity(next);
                }
                else{
                    noPass.setVisibility(View.VISIBLE);
                }
            }
        };
        noButton.setOnClickListener(onnoButtonClick);

        }



    }
