import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        // inputting the number to be checked for positivity
        int operand = Integer.parseInt(reader.nextLine());

        if (operand > 0) System.out.println("The number is positive");
        else System.out.println("The number is not positive");

    } // close main
} // close class
