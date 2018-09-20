
/**
 * Songs in the library.
 *
 * @author Sam Chihak
 * @version 9/7/2018
 */
public class Song
{
    private String title;
    private int rating;
    private double price;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        int rating = 0;
        String title = "";
        double price = 0.0;
        
    }
    // methods
    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double d) 
    {
        price = d;
    }
        
}