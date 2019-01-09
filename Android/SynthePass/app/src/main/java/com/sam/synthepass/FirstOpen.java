package com.sam.synthepass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstOpen extends AppCompatActivity {
    private Button foButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_open);
        foButton = (Button) findViewById(R.id.foButton);

        View.OnClickListener onfoButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                new firstSynth();
            }
        };
        foButton.setOnClickListener(onfoButtonClick);

    }
}
