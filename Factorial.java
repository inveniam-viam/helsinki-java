import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // setting up reader
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());

        int i = 1;

        int prod = 1;

        while (i <= limit) {
            prod *= i;
            i++;
        } // close while loop

        System.out.println("Factorial is " + prod);
    } // close main
} // close class
