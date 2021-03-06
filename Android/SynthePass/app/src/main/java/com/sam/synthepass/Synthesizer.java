package com.sam.synthepass;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Synthesizer extends AppCompatActivity {

    private final int WHOLE_NOTE = 1000;
    private static final String TAG =
            Synthesizer.class.getName();
    private Button eButton;
    private Button fButton;
    private Button aButton;
    private Button bButton;
    private Button bbButton;
    private Button cButton;
    private Button csButton;
    private Button dButton;
    private Button dsButton;
    private Button fsButton;
    private Button gButton;
    private Button gsButton;
    private Button heButton;
    private Button hfButton;
    private Button hfsButton;
    private Button hgButton;
    private Button okButton;
    private Button resButton;

    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBb;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpHE;
    private MediaPlayer mpHF;
    private MediaPlayer mpHFs;
    private MediaPlayer mpHG;
    private int count;
    private String attempt;
    private String synthPass = synthHolder.getInstance().getSynthPass();
    private View incPass;

    final MediaPlayer[] allPlayers = {mpE,mpF,mpA,mpB,mpBb,mpC,mpCs,mpD,mpDs,mpFs,mpG,mpGs,mpHE,mpHF,mpHFs,mpHG};

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("Synthesizer","Audio playback interrupted");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        eButton = findViewById(R.id.eButton);
        fButton = findViewById(R.id.fButton);
        aButton = findViewById(R.id.aButton);
        bButton = findViewById(R.id.bButton);
        bbButton = findViewById(R.id.bbButton);
        cButton = findViewById(R.id.cButton);
        csButton = findViewById(R.id.csButton);
        dButton = findViewById(R.id.dButton);
        dsButton = findViewById(R.id.dsButton);
        fsButton = findViewById(R.id.fsButton);
        gButton = findViewById(R.id.gButton);
        gsButton = findViewById(R.id.gsButton);
        heButton = findViewById(R.id.heButton);
        hfButton = findViewById(R.id.hfButton);
        hfsButton = findViewById(R.id.hfsButton);
        hgButton = findViewById(R.id.hgButton);
        okButton = findViewById(R.id.okButton);
        resButton = findViewById(R.id.resButton);

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpHE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHG = MediaPlayer.create(this, R.raw.scalehighg);
        count = 0;
        attempt = "";
        incPass = findViewById(R.id.incPass);



        View.OnClickListener oneButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpE.seekTo(0);
                Log.i(TAG, "eButton Clicked");
                mpE.start();
                count += 1;
                attempt += "E";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt+"Pass="+synthPass);
            }
        };
        eButton.setOnClickListener(oneButtonClick);
        View.OnClickListener onfButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpF.seekTo(0);
                Log.i(TAG, "fButton Clicked");
                mpF.start();
                count += 1;
                attempt += "F";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        fButton.setOnClickListener(onfButtonClick);

        View.OnClickListener onaButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpA.seekTo(0);
                Log.i(TAG, "aButton Clicked");
                mpA.start();
                count += 1;
                attempt += "A";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        aButton.setOnClickListener(onaButtonClick);

        View.OnClickListener onbButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpB.seekTo(0);
                Log.i(TAG, "bButton Clicked");
                mpB.start();
                count += 1;
                attempt += "B";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        bButton.setOnClickListener(onbButtonClick);

        View.OnClickListener onbbButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpBb.seekTo(0);
                Log.i(TAG, "bbButton Clicked");
                mpBb.start();
                count += 1;
                attempt += "P";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        bbButton.setOnClickListener(onbbButtonClick);

        View.OnClickListener oncButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpC.seekTo(0);
                Log.i(TAG, "cButton Clicked");
                mpC.start();
                count += 1;
                attempt += "C";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        cButton.setOnClickListener(oncButtonClick);
        View.OnClickListener oncsButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpCs.seekTo(0);
                Log.i(TAG, "csButton Clicked");
                mpCs.start();
                count += 1;
                attempt += "O";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        csButton.setOnClickListener(oncsButtonClick);

        View.OnClickListener ondButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpD.seekTo(0);
                Log.i(TAG, "dButton Clicked");
                mpD.start();
                count += 1;
                attempt += "D";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        dButton.setOnClickListener(ondButtonClick);

        View.OnClickListener ondsButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpDs.seekTo(0);
                Log.i(TAG, "dsButton Clicked");
                mpDs.start();
                count += 1;
                attempt += "I";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        dsButton.setOnClickListener(ondsButtonClick);

        View.OnClickListener onfsButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpFs.seekTo(0);
                Log.i(TAG, "fsButton Clicked");
                mpFs.start();
                count += 1;
                attempt += "U";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        fsButton.setOnClickListener(onfsButtonClick);
        View.OnClickListener ongButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpG.seekTo(0);
                Log.i(TAG, "gButton Clicked");
                mpG.start();
                count += 1;
                attempt += "G";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        gButton.setOnClickListener(ongButtonClick);

        View.OnClickListener ongsButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpGs.seekTo(0);
                Log.i(TAG, "gsButton Clicked");
                mpGs.start();
                count += 1;
                attempt += "Y";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        gsButton.setOnClickListener(ongsButtonClick);

        View.OnClickListener onheButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpHE.seekTo(0);
                Log.i(TAG, "heButton Clicked");
                mpHE.start();
                count += 1;
                attempt += "T";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        heButton.setOnClickListener(onheButtonClick);

        View.OnClickListener onhfButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpHF.seekTo(0);
                Log.i(TAG, "hfButton Clicked");
                mpHF.start();
                count += 1;
                attempt += "R";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        hfButton.setOnClickListener(onhfButtonClick);

        View.OnClickListener onhfsButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpHFs.seekTo(0);
                Log.i(TAG, "hfsButton Clicked");
                mpHFs.start();
                count += 1;
                attempt += "W";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        hfsButton.setOnClickListener(onhfsButtonClick);

        View.OnClickListener onhgButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                mpHG.seekTo(0);
                Log.i(TAG, "hgButton Clicked");
                mpHG.start();
                count += 1;
                attempt += "Q";
                Log.i(TAG, "count:"+count+", "+"current pass:"+attempt);
            }
        };
        hgButton.setOnClickListener(onhgButtonClick);

        View.OnClickListener onokButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                if(attempt.equals(synthPass)){
                Intent first = new Intent(Synthesizer.this, Passwords.class);
                Synthesizer.this.startActivity(first);}
                else{
                    incPass.setVisibility(View.VISIBLE);
                }

            }
        };
        okButton.setOnClickListener(onokButtonClick);
        View.OnClickListener onresButtonClick = new View.OnClickListener() {
            public void onClick(View v) {
                count = 0;
                attempt = "";
                incPass.setVisibility(View.INVISIBLE);
            }
        };
        resButton.setOnClickListener(onresButtonClick);
        /*if (count >= 4){
            for(int i = 0; i <allPlayers.length; i++){
                allPlayers[i].seekTo(0);}
            if (attempt == synthPass){
                //open next activity
            }
        };*/


    }

}

