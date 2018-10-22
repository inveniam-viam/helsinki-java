import java.util.Scanner;

public class sumBetweenTwo {
    public static void main(String[] args) {
        // setting up reader
        Scanner reader = new Scanner(System.in);

        // set lower bound
        System.out.println("First: ");
        int lower = Integer.parseInt(reader.nextLine());
        // set upper bound
        System.out.println("Last: ");
        int upper = Integer.parseInt(reader.nextLine());

        // set helper sum variable
        int sum = 0;

        while (lower <= upper) {
            sum += lower;
            lower++;
        } // close while loop

        System.out.println("The sum is " + sum);


    } // close main
} // close class
