import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        // read in the first number as a double
        double operandOne = Double.parseDouble(reader.nextLine());
        System.out.println("Type another number: ");
        // read in the second operand, again as a double
        double operandTwo = Double.parseDouble(reader.nextLine());
        System.out.println("Division: " + (operandOne / operandTwo));

    } //  close main
} // close class
