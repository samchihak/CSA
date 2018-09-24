
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
    private boolean favorite;
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
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    public void addToFavorites(){
        favorite = true;
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
    public int getRating(){
        return rating;
    }
}