
/**
 * Books in MediaLib.
 *
 * @author Sam Chihak and Sam Rivers
 * @version 9/12/18
 */
public class Book extends All
{
    public Book()
    {
        int rating = 0;
        String title = "";  
    }
    public Book(String title, int rating, double price, int duration){
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.duration = duration;
    }
    public String getDuration(){
        String strDuration = duration + " " + "pages";
        return strDuration;
    }
    
}
