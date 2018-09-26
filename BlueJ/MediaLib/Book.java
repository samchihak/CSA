
/**
 * Books in MediaLib.
 *
 * @author Sam Chihak and Sam Rivers
 * @version 9/12/18
 */
public class Book
{
    private String title;
    private int rating;
    /**
     * Constructor for objects of class Song
     */
    public Book()
    {
        // initialise instance variables
        int rating = 0;
        String title = "";  
    }
    public Book(String title, int rating){
        this.title = title;
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
    public int getRating(){
        return rating;
    }
}
