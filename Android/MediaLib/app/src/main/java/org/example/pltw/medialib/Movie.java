package org.example.pltw.medialib;

public class Movie {
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Movie() {
        // initialise instance variables
        int rating = 0;
        String title = "";
    }

    // methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }
}
