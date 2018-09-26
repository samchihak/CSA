
/**
 * Media Library Project
 *
 * @author Sam Chihak and Sam Rivers
 * @version 9/25
 */
public class MediaLib
{
    public static void main ()
    {
        double totalCost = 0.0;
        int numSongs = 0; 
        int totalRatings = 0;
        
        System.out.println("Welcome to your Media Library");
        System.out.println(" ");
        System.out.println("Songs:");
        
        Song song1 = new Song("Gimme Shelter by The Rolling Stones", 1.29, 10);
        totalCost += song1.getPrice();
        numSongs += 1;
        totalRatings += song1.getRating();
        
        Song song2 = new Song("Sunshine of Your Love by Cream", 0.99, 9);
        numSongs += 1;
        totalRatings += song2.getRating();
        totalCost += song2.getPrice();
        
        Song song3 = new Song("Comfortably Numb by Pink Floyd", 0.99, 9);
        numSongs += 1;
        totalRatings += song3.getRating();
        totalCost += song3.getPrice();
        
        Song song4 = new Song("Layla by Eric Clapton", 0.99, 8);
        numSongs += 1;
        totalRatings += song4.getRating();
        totalCost += song4.getPrice();
        
        Song song5 = new Song("What is Life by George Harrison", 1.29, 8);
        numSongs += 1;
        totalRatings += song5.getRating();
        totalCost += song5.getPrice();
        
        Song song6 = new Song("Little Green Bag by the George Baker Selection", 1.29, 8);
        numSongs += 1;
        totalRatings += song6.getRating();
        totalCost += song6.getPrice();
        
        Song song7 = new Song("The Man In Me by Bob Dylan", 1.29, 8);
        numSongs += 1;
        totalRatings += song7.getRating();
        totalCost += song7.getPrice();
        
        Song song8 = new Song("Stuck In The Middle With You by Stealers Wheel", 0.99, 7);
        numSongs += 1;
        totalRatings += song8.getRating();
        totalCost += song8.getPrice();
        
        double averageCost = totalCost/numSongs;
        double averageRating = totalRatings/numSongs;
        System.out.println(" ");
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        System.out.println(song1.getPrice());
        System.out.println(" ");
        System.out.println(song2.getTitle());
        System.out.println(song2.getRating());
        System.out.println(song2.getPrice());
        System.out.println(" ");
        System.out.println(song3.getTitle());
        System.out.println(song3.getRating());
        System.out.println(song3.getPrice());
        System.out.println(" ");
        System.out.println(song4.getTitle());
        System.out.println(song4.getRating());
        System.out.println(song4.getPrice());
        System.out.println(" ");
        System.out.println(song5.getTitle());
        System.out.println(song5.getRating());
        System.out.println(song5.getPrice());
        System.out.println(" ");
        System.out.println(song6.getTitle());
        System.out.println(song6.getRating());
        System.out.println(song6.getPrice());
        System.out.println(" ");
        System.out.println(song7.getTitle());
        System.out.println(song7.getRating());
        System.out.println(song7.getPrice());
        System.out.println(" ");
        System.out.println(song8.getTitle());
        System.out.println(song8.getRating());
        System.out.println(song8.getPrice());
        System.out.println(" ");
        System.out.println("Average Cost" + " " + averageCost);
        System.out.println ("Average Rating" + " " + averageRating);
        System.out.println(" ");
        System.out.println("Books:");
        System.out.println(" ");
        
        Book book1 = new Book("Harry Potter and the Goblet of Fire by J.K Rowling", 8);
        System.out.println(book1.getTitle());
        System.out.println(book1.getRating());
        
        System.out.println(" ");
        System.out.println("Movies:");
        System.out.println(" ");
        
        Film film1 = new Film("Goodfellas (1990)", 10, 148);
        Film film2 = new Film("Heat (1995)", 10, 172);
        Film film3 = new Film("The Godfather Part II (1974)",10, 202);
        Film film4 = new Film("Full Metal Jacket (1987)", 9, 116);
        Film film5 = new Film("Reservoir Dogs (1992)", 9,99);
        Film film6 = new Film("The Big Lebowski (1998)", 8, 119);
        Film film7 = new Film("Casino (1995)", 8, 178);
        Film film8 = new Film("Animal House (1978)", 8,109);
        
        System.out.println(film1.getTitle());
        System.out.println(film1.getRating());
        System.out.println(film1.dispDur());
        System.out.println(" ");
        System.out.println(film2.getTitle());
        System.out.println(film2.getRating());
        System.out.println(film2.dispDur());
        System.out.println(" ");
        System.out.println(film3.getTitle());
        System.out.println(film3.getRating());
        System.out.println(film3.dispDur());
        System.out.println(" ");
        System.out.println(film4.getTitle());
        System.out.println(film4.getRating());
        System.out.println(film4.dispDur());
        System.out.println(" ");
        System.out.println(film5.getTitle());
        System.out.println(film5.getRating());
        System.out.println(film5.dispDur());
        System.out.println(" ");
        System.out.println(film6.getTitle());
        System.out.println(film6.getRating());
        System.out.println(film6.dispDur());
        System.out.println(" ");
        System.out.println(film7.getTitle());
        System.out.println(film7.getRating());
        System.out.println(film7.dispDur());
        System.out.println(" ");
        System.out.println(film8.getTitle());
        System.out.println(film8.getRating());
        System.out.println(film8.dispDur());
        

    }  
    
} 
