
/**
 * Movies in MediaLib.
 *
 * @author Sam Chihak
 * @version 9/12/18
 */
public class Movie
{
   private String title;
    /**
     * Constructor for objects of class Song
     */
    public Movie()
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
