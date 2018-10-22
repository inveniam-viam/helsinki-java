import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        // setting up reader
        Scanner reader = new Scanner(System.in);
        // initialize lower bound
        System.out.println("First: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        // actual code

        if (lowerLimit < upperLimit) {
            while (lowerLimit <= upperLimit) {
                System.out.println(lowerLimit);
                lowerLimit++;
            } // close while
        }

    } // close main
} // close class
