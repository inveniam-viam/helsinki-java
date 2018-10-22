import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // inputting the two numbers
        System.out.println("Type the first number: ");
        double numberOne = Double.parseDouble(reader.nextLine());
        System.out.println("Type the second number: ");
        double numberTwo = Double.parseDouble(reader.nextLine());

        // comparisons
        if (numberOne > numberTwo) System.out.println("Greater number: " + numberOne);
        else if (numberOne == numberTwo) System.out.println("The numbers are equal!");
        else System.out.println("Greater number: " + numberTwo);


    } // close main
} // close class
