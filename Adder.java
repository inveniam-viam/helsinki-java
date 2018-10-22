import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        // input first operand
        int operandOne = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int operandTwo = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the two numbers: " + (operandOne + operandTwo));


    } // close main
} // close class
