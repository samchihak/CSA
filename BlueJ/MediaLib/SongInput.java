import java.util.Scanner;
/**
 * Write a description of class SongInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SongInput
{
    
    public static void songInput(){
    
        String title;
        int rating;
        int duration;
        double price;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What's the name of the song?");
        title = userInput.nextLine();
        System.out.println("What would you rate it out of 10?");
        rating = userInput.nextInt();
        System.out.println("How long is it in seconds?");
        duration = userInput.nextInt();
        System.out.println("How much does it cost?");
        price = userInput.nextDouble();
        // Close the scanner object using close() method to prevent memory leak
        userInput.close();
        Song userSong = new Song(title, price, rating, duration);
        userSong.pint();
    }

}
