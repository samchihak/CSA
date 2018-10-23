import java.util.*;
import java.io.*;
/**
* Attempting to create a function that allows user to input films to MediaLib
 *
 * @author Sam Chihak & Rivers
 * @version 10/22
 */
public class FilmInput
{

    public static void filmInput(){
        String title;
        int rating;
        int duration;
        double price;
        int x = 0;
        System.out.println("Enter some of your favorite films.");
        System.out.println(" ");
        Scanner numfilms = new Scanner(System.in);
        System.out.println("How many films do you want to enter?");
        int nums = numfilms.nextInt();
        numfilms.close();
        ArrayList<Film> userfilms = new ArrayList<Film>(nums-1);
        while(x<(nums)){

            Scanner userInput = new Scanner(System.in);
            System.out.println("What's the name of the film?");
            title = userInput.nextLine();
            System.out.println("What would you rate it out of 10?");
            rating = userInput.nextInt();
            System.out.println("How many pages is it?");
            duration = userInput.nextInt();
            System.out.println("How much does it cost?");
            price = userInput.nextDouble();

            // Close the scanner object using close() method to prevent memory leak
            userInput.close();
            Film userFilm = new Film(title, rating, duration, price);
            userfilms.add(userFilm);
            x += 1;
            System.out.println("__________________________");
        }
        System.out.println("Here are your favorite films:");
        for (int i=0; i<userfilms.size(); i++)
            userfilms.get(i).pint(); 
    }
}
