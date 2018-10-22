import java.util.Scanner;

public class SumPowers {
    public static void main(String[] args) {
        // setting up reader
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());

        // helper sum variable
        int sum = 0;

        // helper exponent variable
        int i = 0;

        while (i <= limit) {
            sum += (int) Math.pow(2, i);
            i++;
        } // close while

        System.out.println("The result is " + sum);
    } // close main
} // close class
