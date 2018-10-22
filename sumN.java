import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
        // setting up reader
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());

        int sum = 0;

        int i = 1;

        while (i <= limit) {

            sum += i;
            i++;

        } // close while

        System.out.println("Sum is: " + sum);
    } // close main
} // close class
