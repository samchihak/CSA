import java.util.*;
import java.io.*;
/**
 * Attempting to create a function that allows user to input songs to MediaLib
 *
 * @author Sam Chihak & Rivers
 * @version 10/22
 */
public class SongInput
{

    public static void songInput(){
        String title;
        int rating;
        int duration;
        double price;
        int x = 0;
        System.out.println("Enter some of your favorite songs.");
        System.out.println(" ");
        Scanner numSongs = new Scanner(System.in);
        System.out.println("How many songs do you want to enter?");
        int nums = numSongs.nextInt();
        numSongs.close();
        ArrayList<Song> userSongs = new ArrayList<Song>(nums-1);
        while(x<(nums)){

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
            userSongs.add(userSong);
            x += 1;
        }
        System.out.println("Here are your favorite songs:");
        System.out.println(" ");
        for (int i=0; i<userSongs.size(); i++)
            userSongs.get(i).pint(); 
    }

}
