import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // read in year
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        // check if leap year or not
        if (year % 100 == 0) {
            if (year % 400 == 0) System.out.println("The year is a leap year.");
            else System.out.println("The year is not a leap year");
        }
        else if (year % 4 == 0) System.out.println("The year is a leap year.");
        else System.out.println("The year is not a leap year.");

    } // close main
} // close class
