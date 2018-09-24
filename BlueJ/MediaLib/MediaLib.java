
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main ()
    {
        double totalCost = 0.0;
        int numSongs = 0; 
        int totalRatings = 0;
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song("Sold Out Dates",1.29,8);
        totalCost += song1.getPrice();
        numSongs += 1;
        totalRatings += song1.getRating();
        Song song2 = new Song("Yosemite",1.29,8);
        numSongs += 1;
        totalRatings += song2.getRating();
        totalCost += song2.getPrice();
        Song song3 = new Song("Stoves on 14th",.99,7);
        numSongs += 1;
        totalRatings += song3.getRating();
        totalCost += song3.getPrice();
        Song song4 = new Song("Freestyle",1.29,8);
        numSongs += 1;
        totalRatings += song4.getRating();
        totalCost += song4.getPrice();
        Song song5 = new Song("IANAHB",1.29,9);
        numSongs += 1;
        totalRatings += song5.getRating();
        totalCost += song5.getPrice();
        Song song6 = new Song("Spending Addiction",.99,8);
        numSongs += 1;
        totalRatings += song6.getRating();
        totalCost += song6.getPrice();
        Song song7 = new Song("Of Course We Ghetto Flowers",1.29,9);
        numSongs += 1;
        totalRatings += song7.getRating();
        totalCost += song7.getPrice();
        Song song8 = new Song("Wind In My Sails",1.29,10);
        numSongs += 1;
        totalRatings += song8.getRating();
        totalCost += song8.getPrice();
        double averageCost = totalCost/numSongs;
        System.out.println(averageCost);
        double averageRating = totalRatings/numSongs;
        System.out.println (averageRating);
        Book book1 = new Book();
        book1.setTitle("Thus Spoke Zarathustra");
        System.out.println(book1.getTitle());
        Movie movie1 = new Movie("Gladiator", 171, 9);
        System.out.println(movie1.dispDur());

    }  
    
} 
