
/**
 * Abstract class All - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class All
{
    // instance variables - replace the example below with your own
    public String title;
    public int rating;
    public double price;
    public int duration;
    public String strDuration;
    
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
    public void setDuration(int d) {
        duration = d;
    }
    public String getDuration(){
        return strDuration;
    }
    public void pint(){
        System.out.println(" ");
        System.out.println(getTitle());
        System.out.println("Rating:" + " " + getRating());
        System.out.println("Price:" + " " + getPrice() + " " + "dollars");
        System.out.println(getDuration());
    }
    
   
}
