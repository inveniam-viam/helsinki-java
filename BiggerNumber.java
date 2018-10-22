import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double numberOne = Double.parseDouble(reader.nextLine());
        System.out.println("Type another number: ");
        double numberTwo = Double.parseDouble(reader.nextLine());

        System.out.println(
                "The bigger of the two numbers given was: " + (Math.max(numberOne, numberTwo)));
    } // close main
} // close class
