
/**
 * Songs in the library.
 *
 * @author Sam Chihak
 * @version 9/7/2018
 */
public class Song
{
    private String title;
    /**
     * Constructor for objects of class Song
     */
    public Song()
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
}