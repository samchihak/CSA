package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
        //Greeter greeter = new Greeter();
        //welcomeText.settext(greeter.message);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        outputText.append("Welcome to your Media Library.");
        outputText.append("\n");
        outputText.append("\n");

        outputText.append("SONGS:");
        outputText.append("\n");
        Song song1 = new Song();
        song1.setTitle("Sold Out Dates");
        song1.setArtist("Gunna feat. Lil Baby");
        outputText.append(song1.getTitle());
        outputText.append(" " + "by" + " ");
        outputText.append(song1.getArtist());
        outputText.append("\n");
        Song song2 = new Song();
        song2.setTitle("St. Brick Intro");
        song2.setArtist("Gucci Mane");
        outputText.append(song2.getTitle());
        outputText.append(" " + "by" + " ");
        outputText.append(song2.getArtist());
        outputText.append("\n");
        outputText.append(song1.sung);
        outputText.append("\n");
        outputText.append("\n");
        outputText.append("MOVIES:");
        outputText.append("\n");
        Movie movie1 = new Movie();
        movie1.setTitle("Gladiator");
        outputText.append(movie1.getTitle());
        outputText.append("\n");
        outputText.append("\n");
        outputText.append("BOOKS:");
        Book book1 = new Book();
        book1.setTitle("Thus Spoke Zarathustra");
        book1.setAuthor("Friedrich Nietzsche");
        outputText.append("\n");
        outputText.append(book1.getTitle());
        outputText.append(" "+"by"+" ");
        outputText.append(book1.getAuthor());

    }
}
