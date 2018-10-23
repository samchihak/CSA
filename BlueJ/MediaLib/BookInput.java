import java.util.*;
import java.io.*;
/**
* Attempting to create a function that allows user to input books to MediaLib
 *
 * @author Sam Chihak & Rivers
 * @version 10/22
 */
public class BookInput
{

    public static void bookInput(){
        String title;
        int rating;
        int duration;
        double price;
        int x = 0;
        System.out.println("Enter some of your favorite books.");
        System.out.println(" ");
        Scanner numBooks = new Scanner(System.in);
        System.out.println("How many books do you want to enter?");
        int nums = numBooks.nextInt();
        numBooks.close();
        ArrayList<Book> userBooks = new ArrayList<Book>(nums-1);
        while(x<(nums)){

            Scanner userInput = new Scanner(System.in);
            System.out.println("What's the name of the book?");
            title = userInput.nextLine();
            System.out.println("What would you rate it out of 10?");
            rating = userInput.nextInt();
            System.out.println("How many pages is it?");
            duration = userInput.nextInt();
            System.out.println("How much does it cost?");
            price = userInput.nextDouble();

            // Close the scanner object using close() method to prevent memory leak
            userInput.close();
            Book userBook = new Book(title, rating, price, duration);
            userBooks.add(userBook);
            x += 1;
            System.out.println("__________________________");
        }
        System.out.println("Here are your favorite books:");
        for (int i=0; i<userBooks.size(); i++)
            userBooks.get(i).pint(); 
    }
}
