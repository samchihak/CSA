package org.example.pltw.medialib;

public class Book {
    private String title;
    private String author;
    /**
     * Constructor for objects of class Song
     */
    public Book()
    {
        // initialise instance variables
        int rating = 0;
        String title = "";
    }
    // methods
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String a) {
        author = a;
    }
}
