
/**
 * Movies in MediaLib.
 *
 * @author Sam Chihak
 * @version 9/12/18
 */
public class Movie
{
   private String title;
   private int duration;
   private int rating;
   private int hours;
   private int minutes;
   private String length;
    /**
     * Constructor for objects of class Song
     */
    public Movie()
    {
        // initialise instance variables
        int rating = 0;
        String title = ""; 
        int duration = 0;
    }
    public Movie(String title, int duration, int rating){
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }
    // methods
    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }
    
    public int getDuration(){
        return duration;
    }
    
    public void setDuration(int d) {
        duration = d;
    }
    
    public String dispDur(){
        minutes = duration % 60;
        hours = (duration - minutes)/60;
        length = hours + " " + "Hours" + " " + minutes + " " + "minutes";
        return length;
    }
}
