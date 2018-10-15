
/**
 * Songs in the library.
 *
 * @author Sam Chihak and Sam Rivers
 * @version 9/7/2018 
 */
public class Song extends All
{
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
    public Song(String title, double price, int rating, int duration) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.duration = duration;
    }
    public void addToFavorites(){
        favorite = true;
    }
    public String getDuration(){
      int seconds = duration % 60;
      int minutes = (duration - seconds) / 60;
      String strDuration = minutes + " " + "minutes" + " " + seconds + " " + "seconds";
      return strDuration;
    }  
}