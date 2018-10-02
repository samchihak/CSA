package com.company;

public class Main {
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     *
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String args[])
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        String firstThree = firstName.substring(0,3);
        String lastTwo = lastName.substring(0,2);
        String sciFirst = firstThree + lastTwo;
        String cityTwo = city.substring(0,2);
        String schoolThree = school.substring(0,3);
        String sciLast = cityTwo + schoolThree;

        double ran1 = (Math.random() * (relativeName1.length() - 1) + 1);
        double rand1 = (Math.round(ran1));
        double rando1 = (Math.round(rand1 * 10000.0)/10000.0);
        int random1 = (int) rando1;

        double ran2 = (Math.random() * (relativeName1.length() - 1) + 1);
        double rand2 = (Math.round(ran2));
        double rando2 = (Math.round(rand2 * 10000.0)/10000.0);
        int random2 = (int) rando2;

        String lastRel1 = relativeName1.substring(random1);
        String lastRel2 = relativeName2.substring(random2);

        String sciLoc = lastRel1 + lastRel2;




    }
}
