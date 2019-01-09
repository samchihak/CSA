package com.sam.synthepass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class synthHolder extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String synthPass;
    public String getSynthPass() {return synthPass;}
    public void setSynthPass(String synthPass) {this.synthPass = synthPass;}

    private static final synthHolder holder = new synthHolder();
    public static synthHolder getInstance() {return holder;}
}
