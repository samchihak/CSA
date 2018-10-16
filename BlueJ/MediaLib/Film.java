
/**
 * Movies in MediaLib.
 *
 * @author Sam Chihak and Sam Rivers
 * @version 9/12/18
 */
public class Film extends All
{
    /**
     * Constructor for objects of class Song
     */
    public Film()
    {
        // initialise instance variables
        int rating = 0;
        String title = ""; 
        int duration = 0;
        double price = 0.0;
    }
    public Film(String title, int rating, int duration, double price){
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.price = price;
    }
    // methods
    public String getDuration(){
        int minutes = duration % 60;
        int hours = (duration - minutes)/60;
        String strDuration = hours + " " + "Hours" + " " + minutes + " " + "minutes";
        return strDuration;
    }
    
    
    
}
